# FDC3 APP Directory Reference Implementation - Java + Springboot

An application directory (appD) is a structured repository of information about apps that can be used in an FDC3-enabled desktop(more info [here](https://fdc3.finos.org)). In other words, it’s a convenient way of storing and managing metadata about apps in your ecosystem.

The application metadata stored in appD records may include: the app name, type, details about how to run the application, its icons, publisher, support contact details and so on. It may also include links to or embed manifest formats defined elsewhere, such as proprietary manifests for launching the app in a container product or a Web Application Manifest (as defined by the W3C).

All this information is readily available in one place and can be used both to populate a launcher or app catalog UI for your users, and by the Desktop Agent managing the apps on your desktop. In fact, if your desktop platform supports the FDC3 standard, appD is the primary way that the FDC3 Desktop Agent implementation should receive the details about apps available to run on your desktop. Conversely, if an app is not listed in appD, the Desktop Agent can’t ensure its participation in context sharing or use it to resolve intents.

## Try out on local machine


1. Clone the repository to your local machine 

> mkdir FDC3 
>
> cd FDC3
> 
> git clone 
> 

2. Install the Dependencies

> cd FINOS/fdc3-app-directory-java
> 
> mvn clean install 

3. Run the application
>cd target 
> 
>java -jar *.jar 

### End points implemented 
1. /v2/apps
2. /v2/apps/{appId}

## Foreword 

This is a reference implementation for app Directory implemented in Java and springboot.

The implementation is packaged with a sample App Directory JSON (src/main/resources/local.v2.json) which is  processed and the results are returned by the above-mentioned APIs . 




