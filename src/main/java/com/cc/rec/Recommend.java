package com.cc.rec;

import com.cc.dao.CompaniesRepoMapper;
import com.cc.dao.LogMapper;
import com.cc.dao.RecMapper;
import com.cc.morelike.CurlRec;
import com.cc.pojo.Log;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cc on 2017/4/25.
 */
public class Recommend {
    public static void main(String[] args) throws Exception{


        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));



        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        LogMapper logMapper = (LogMapper) context.getBean("logMapper");
        RecMapper recMapper = (RecMapper) context.getBean("recMapper");
        CurlRec curlRec = new CurlRec();
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"companies");
        map.put(2,"countries");
        map.put(3,"pebook");
        map.put(4,"regulation");
        map.put(5,"uansr");
        map.put(6,"uebook");
        for (int i = 101; i <102 ; i++) {
            for (int j = 1; j < 7; j++) {
                if (j==3){
                    continue;
                }
                Log log = new Log();
                log.setUserId(String.valueOf(i));
                log.setResTypeId(j);
                List<Log> list = logMapper.selectUserHistory(log);
                String[] ids = new String[list.size()];
                for (int k = 0; k < list.size() ; k++) {
                    ids[k]=list.get(k).getResId();
                    System.out.println("------------");
                    System.out.println(list.get(k).toString());
                }
                String s = curlRec.rec(client,map.get(j),ids);
                System.out.println(s);
            }
        }
        client.close();
    }
}
