package com.cc.controller;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

/**
 * Created by cc on 2017/4/21.
 */
public class Test {


public static void main(String[] args) throws Exception{

    Settings settings = Settings.builder()
            .put("cluster.name", "myClusterName").build();

    // on startup

    TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
            .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host1"), 9300))
            .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host2"), 9300));

// on shutdown


    client.close();
}
}
