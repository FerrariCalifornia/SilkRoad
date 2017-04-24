package com.cc.es;

import com.cc.dao.BookMapper;
import com.cc.dao.CompaniesRepoMapper;
import com.cc.pojo.CompaniesRepo;
import com.google.gson.Gson;
import org.elasticsearch.action.bulk.byscroll.BulkByScrollResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;
import java.util.List;

/**
 * Created by cc on 2017/4/23.
 */
public class CompaniesInit {



    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        CompaniesRepoMapper companiesRepoMapper = (CompaniesRepoMapper) context.getBean("companiesRepoMapper");


        List<CompaniesRepo> list = companiesRepoMapper.selectAll();
        Gson gson = new Gson();



        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        BulkByScrollResponse response =
                DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
                        .source("companies")
                        .get();

        long deleted = response.getDeleted();
        System.err.println(deleted);

        for (CompaniesRepo c:list
             ) {
            String json = gson.toJson(c);
            client.prepareIndex("companies", "companiesRepo")
                    .setId(c.getId())
                    .setSource(json)
                    .get();
        }

        client.close();
    }
}
