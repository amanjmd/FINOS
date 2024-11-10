package com.fdc.appd.service;

import com.fdc.appd.model.AllApplicationsResponse;
import com.fdc.appd.model.Application;

public interface V2ApplicationReader {

    public Application getApplication(String appId);

    public AllApplicationsResponse getAllApplication();
}
