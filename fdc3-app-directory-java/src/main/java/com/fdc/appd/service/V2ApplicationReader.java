package com.fdc.appd.service;

import com.fdc.appd.model.AllApplicationsResponse;
import com.fdc.appd.model.Application;

import java.io.IOException;

public interface V2ApplicationReader {

    public Application getApplication(String appId) throws IOException;

    public AllApplicationsResponse getAllApplication() throws IOException;
}
