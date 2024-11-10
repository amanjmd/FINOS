package com.fdc.appd.datasources;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("fdc.app.json")
public class JsonDatasourceConfig {
    String path ;
}
