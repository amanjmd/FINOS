package com.fdc.appd;

import com.fdc.appd.model.AllApplicationsResponse;
import com.fdc.appd.model.Application;
import jakarta.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link V2ApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T19:40:14.622447+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public interface V2ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v2/apps/{appId} : Retrieve an application definition
     *
     * @param appId  (required)
     * @return OK (status code 200)
     *         or Bad request. (status code 400)
     *         or Forbidden: Certificate authentication is not allowed for the requested user. (status code 403)
     *         or Server error, see response body for further details. (status code 500)
     * @see V2Api#v2AppsAppIdGet
     */
    default ResponseEntity<Application> v2AppsAppIdGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"contactEmail\" : \"contactEmail\", \"tooltip\" : \"tooltip\", \"interop\" : { \"intents\" : { \"raises\" : { \"key\" : [ \"raises\", \"raises\" ] }, \"listensFor\" : { \"key\" : { \"customConfig\" : \"{}\", \"displayName\" : \"displayName\", \"contexts\" : [ \"contexts\", \"contexts\" ], \"resultType\" : \"resultType\" } } }, \"userChannels\" : { \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, \"appChannels\" : [ { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] } ] }, \"description\" : \"description\", \"type\" : \"web\", \"title\" : \"title\", \"icons\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" } ], \"version\" : \"version\", \"moreInfo\" : \"https://openapi-generator.tech\", \"screenshots\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" } ], \"hostManifests\" : { \"key\" : \"https://openapi-generator.tech\" }, \"supportEmail\" : \"supportEmail\", \"customConfig\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"appId\" : \"appId\", \"name\" : \"name\", \"publisher\" : \"publisher\", \"details\" : { \"url\" : \"url\" }, \"categories\" : [ \"categories\", \"categories\" ], \"lang\" : \"lang\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v2/apps : Retrieve all application definitions
     *
     * @return OK (status code 200)
     *         or Bad request. (status code 400)
     *         or Forbidden: Certificate authentication is not allowed for the requested user. (status code 403)
     *         or Server error, see response body for further details. (status code 500)
     * @see V2Api#v2AppsGet
     */
    default ResponseEntity<AllApplicationsResponse> v2AppsGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\", \"applications\" : [ { \"contactEmail\" : \"contactEmail\", \"tooltip\" : \"tooltip\", \"interop\" : { \"intents\" : { \"raises\" : { \"key\" : [ \"raises\", \"raises\" ] }, \"listensFor\" : { \"key\" : { \"customConfig\" : \"{}\", \"displayName\" : \"displayName\", \"contexts\" : [ \"contexts\", \"contexts\" ], \"resultType\" : \"resultType\" } } }, \"userChannels\" : { \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, \"appChannels\" : [ { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] } ] }, \"description\" : \"description\", \"type\" : \"web\", \"title\" : \"title\", \"icons\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" } ], \"version\" : \"version\", \"moreInfo\" : \"https://openapi-generator.tech\", \"screenshots\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" } ], \"hostManifests\" : { \"key\" : \"https://openapi-generator.tech\" }, \"supportEmail\" : \"supportEmail\", \"customConfig\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"appId\" : \"appId\", \"name\" : \"name\", \"publisher\" : \"publisher\", \"details\" : { \"url\" : \"url\" }, \"categories\" : [ \"categories\", \"categories\" ], \"lang\" : \"lang\" }, { \"contactEmail\" : \"contactEmail\", \"tooltip\" : \"tooltip\", \"interop\" : { \"intents\" : { \"raises\" : { \"key\" : [ \"raises\", \"raises\" ] }, \"listensFor\" : { \"key\" : { \"customConfig\" : \"{}\", \"displayName\" : \"displayName\", \"contexts\" : [ \"contexts\", \"contexts\" ], \"resultType\" : \"resultType\" } } }, \"userChannels\" : { \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, \"appChannels\" : [ { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] }, { \"name\" : \"name\", \"description\" : \"description\", \"broadcasts\" : [ \"broadcasts\", \"broadcasts\" ], \"listensFor\" : [ \"listensFor\", \"listensFor\" ] } ] }, \"description\" : \"description\", \"type\" : \"web\", \"title\" : \"title\", \"icons\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"type\" : \"type\" } ], \"version\" : \"version\", \"moreInfo\" : \"https://openapi-generator.tech\", \"screenshots\" : [ { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" }, { \"size\" : \"size\", \"src\" : \"https://openapi-generator.tech\", \"label\" : \"label\", \"type\" : \"type\" } ], \"hostManifests\" : { \"key\" : \"https://openapi-generator.tech\" }, \"supportEmail\" : \"supportEmail\", \"customConfig\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"appId\" : \"appId\", \"name\" : \"name\", \"publisher\" : \"publisher\", \"details\" : { \"url\" : \"url\" }, \"categories\" : [ \"categories\", \"categories\" ], \"lang\" : \"lang\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
