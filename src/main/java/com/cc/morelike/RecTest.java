package com.cc.morelike;

import com.google.gson.Gson;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;


import org.elasticsearch.index.query.MoreLikeThisQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

import static org.elasticsearch.index.query.QueryBuilders.moreLikeThisQuery;

/**
 * Created by cc on 2017/4/24.
 */
public class RecTest {

    public static void main(String[] args) throws Exception{

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        String[] fields = {"summary","title"};
        MoreLikeThisQueryBuilder.Item[] items = new MoreLikeThisQueryBuilder.Item[1];
        MoreLikeThisQueryBuilder.Item i2 = new MoreLikeThisQueryBuilder.Item("uansr","uansrRepo","001476774459201f16defc7695c409e8208cef3cfac2913000");
//        MoreLikeThisQueryBuilder.Item i = new MoreLikeThisQueryBuilder.Item("uansr","uansrRepo","001476774459413204c8498f4504c17961241a9b0c27462000");
        items[0]=i2;
//        items[1]=i2;
        MoreLikeThisQueryBuilder qb = moreLikeThisQuery(fields, items)
                .minTermFreq(1)
                .maxQueryTerms(15);

        SearchResponse response = client.prepareSearch("uansr")
                .setTypes("uansrRepo")
                .setQuery(qb)
                .setSize(10)
                .get();
        Gson gson = new Gson();
        System.err.println(response);
        SearchHit[] s =response.getHits().getHits();
        client.close();
        for (SearchHit sh:s
             ) {
            String json= gson.toJson(sh.getSource().get("id"));
            System.out.println(json);
        }
    }

}
