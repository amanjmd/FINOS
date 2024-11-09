package com.fdc.appd;

import com.fdc.appd.model.AllApplicationsResponse;
import com.fdc.appd.model.Application;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public class V2ApiDelegateImpl implements V2ApiDelegate{



    @Override
    public Optional<NativeWebRequest> getRequest() {
        return V2ApiDelegate.super.getRequest();
    }

    /**
     * GET /v2/apps/{appId} : Retrieve an application definition
     *
     * @param appId (required)
     * @return OK (status code 200)
     * or Bad request. (status code 400)
     * or Forbidden: Certificate authentication is not allowed for the requested user. (status code 403)
     * or Server error, see response body for further details. (status code 500)
     * @see V2Api#v2AppsAppIdGet
     */
    @Override
    public ResponseEntity<Application> v2AppsAppIdGet(String appId) {
        return V2ApiDelegate.super.v2AppsAppIdGet(appId);
    }

    /**
     * GET /v2/apps : Retrieve all application definitions
     *
     * @return OK (status code 200)
     * or Bad request. (status code 400)
     * or Forbidden: Certificate authentication is not allowed for the requested user. (status code 403)
     * or Server error, see response body for further details. (status code 500)
     * @see V2Api#v2AppsGet
     */
    @Override
    public ResponseEntity<AllApplicationsResponse> v2AppsGet() {
        return V2ApiDelegate.super.v2AppsGet();
    }
}
