package com.fdc.appd.datasources;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("fdc.app.json")
public class JsonDatasourceConfig {

    public String path ;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
