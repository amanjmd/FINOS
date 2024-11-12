package com.fdc.appd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReaderFactory {

    @Autowired
    V2ApplicationJsonReaderImpl v2ApplicationJsonReader;

    @Value("${fdc.application.readerType}")
    String readerType;

    public V2ApplicationReader createApplicationReader(){
        if(readerType.equalsIgnoreCase("JSON")){
            return v2ApplicationJsonReader;
        }
        else
            throw new RuntimeException("No valid reader entry found");
    }
}
