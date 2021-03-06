package com.cc.es;

import com.cc.dao.CompaniesRepoMapper;
import com.cc.dao.RegulationRepoMapper;
import com.cc.pojo.CompaniesRepo;
import com.cc.pojo.RegulationRepo;
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
public class RegulationInit {



    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        RegulationRepoMapper a = (RegulationRepoMapper) context.getBean("regulationRepoMapper");


        List<RegulationRepo> list = a.selectAll();
        Gson gson = new Gson();

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));


        BulkByScrollResponse response =
                DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
                        .source("regulation")
                        .get();

        long deleted = response.getDeleted();
        System.err.println(deleted);
        for (RegulationRepo c:list
             ) {
            String json = gson.toJson(c);
            client.prepareIndex("regulation", "regulationRepo")
                    .setSource(json)
                    .setId(c.getId())
                    .get();
        }

        client.close();
    }
}
