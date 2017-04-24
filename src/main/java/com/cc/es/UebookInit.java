package com.cc.es;

import com.cc.dao.UansrRepoMapper;
import com.cc.dao.UebookRepoMapper;
import com.cc.pojo.UansrRepo;
import com.cc.pojo.UebookRepo;
import com.google.gson.Gson;
import org.elasticsearch.action.bulk.byscroll.BulkByScrollResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;
import java.util.List;

/**
 * Created by cc on 2017/4/23.
 */
public class UebookInit {



    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UebookRepoMapper a = (UebookRepoMapper) context.getBean("uebookRepoMapper");


        List<UebookRepo> list = a.selectAll();
        Gson gson = new Gson();

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        BulkByScrollResponse response =
                DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
                        .source("uebook")
                        .get();

        long deleted = response.getDeleted();
        System.err.println(deleted);
        for (UebookRepo c:list
             ) {
            String json = gson.toJson(c);
            client.prepareIndex("uebook", "uebookRepo")
                    .setSource(json)
                    .setId(c.getId())
                    .get();
        }

        client.close();
    }
}
