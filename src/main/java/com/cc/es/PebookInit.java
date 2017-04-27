package com.cc.es;

import com.cc.dao.CompaniesRepoMapper;
import com.cc.dao.PebookRepoMapper;
import com.cc.pojo.CompaniesRepo;
import com.cc.pojo.PebookRepo;
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
public class PebookInit {



    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        PebookRepoMapper companiesRepoMapper = (PebookRepoMapper) context.getBean("pebookRepoMapper");


        List<PebookRepo> list = companiesRepoMapper.selectAll();
        Gson gson = new Gson();



        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
//如果存在索引 用下面注释的代码删除
//        BulkByScrollResponse response =
//                DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
//                        .source("pebook")
//                        .get();
//
//        long deleted = response.getDeleted();
//        System.err.println(deleted);

        for (PebookRepo c:list
             ) {
            String json = gson.toJson(c);
            client.prepareIndex("pebook", "pebookRepo")
                    .setId(c.getId())
                    .setSource(json)
                    .get();
        }

        client.close();
    }
}
