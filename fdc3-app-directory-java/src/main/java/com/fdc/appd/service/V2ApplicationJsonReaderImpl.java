package com.fdc.appd.service;

import com.fdc.appd.model.AllApplicationsResponse;
import com.fdc.appd.model.Application;
import org.springframework.stereotype.Service;

@Service
public class V2ApplicationJsonReaderImpl implements  V2ApplicationReader{
    @Override
    public Application getApplication(String appId) {
        return null;
    }

    @Override
    public AllApplicationsResponse getAllApplication() {
        return null;
    }
}
