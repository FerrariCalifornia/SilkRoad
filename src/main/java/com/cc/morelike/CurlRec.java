package com.cc.morelike;


import com.google.gson.Gson;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.MoreLikeThisQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.moreLikeThisQuery;

/**
 * Created by cc on 2017/4/24.
 */
public class CurlRec {

    public static void main(String[] args) throws Exception{
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        String[] ids = {"001476774459201f16defc7695c409e8208cef3cfac2913000","001476774459413204c8498f4504c17961241a9b0c27462000"};
        rec(client,"uansr",ids);
        client.close();
    }


    public static String rec(TransportClient client,String res_type,String[] ids) throws Exception{
        System.out.println("start rec");
        String index = res_type;
        String type = res_type+"Repo";
        int idLength= ids.length;
        String[] fields = new String[2];
        for (String s :ids
             ) {
            System.out.println("res_id="+s);
        }

        if (res_type.equals("uansr")|| res_type.equals("uebook")){
            fields[0]="summary";
            fields[1]="title";
        }else if(res_type.equals("companies")){
            fields[0]="summary";
            fields[1]="name";
        }else if(res_type.equals("countries")||res_type.equals("regulation")){
            fields[0]="id";
            fields[1]="title";
        }else {
            fields[0]="summary";
            fields[1]="title";

        }
        MoreLikeThisQueryBuilder.Item[] items = new MoreLikeThisQueryBuilder.Item[idLength];
        for (int i = 0; i <idLength ; i++) {
            items[i]=new MoreLikeThisQueryBuilder.Item(index,type,ids[i]);
        }
        MoreLikeThisQueryBuilder qb = moreLikeThisQuery(fields, items)
                .minTermFreq(1)
                .maxQueryTerms(15);
        SearchResponse response = client.prepareSearch(index)
                .setTypes(type)
                .setQuery(qb)
                .setSize(10)
                .get();
        Gson gson = new Gson();
        System.err.println(response);
        SearchHit[] s =response.getHits().getHits();

//        for (SearchHit sh:s
//                ) {
//            String json= gson.toJson(sh.getSource());
//            System.out.println(json);
//        }
        return gson.toJson(s);
    }

}
