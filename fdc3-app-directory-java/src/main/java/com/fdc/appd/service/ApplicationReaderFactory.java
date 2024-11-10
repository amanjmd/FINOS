package com.fdc.appd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ApplicationReaderFactory {

    @Autowired(required = false)
    V2ApplicationJsonReaderImpl v2ApplicationJsonReader;

    @Value("fdc.application.readerType")
    String readerType;

    public V2ApplicationReader createApplicationReader(){
        if(readerType.equalsIgnoreCase("JSON")){
            return v2ApplicationJsonReader;
        }
        else
            throw new RuntimeException("No valid reader entry found");
    }
}
