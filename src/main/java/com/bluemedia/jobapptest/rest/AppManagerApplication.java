package com.bluemedia.jobapptest.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationPath("/appmgr")
public class AppManagerApplication extends Application {
    
    @GET
    @Path("/")
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Welcome to AppManager";
    }
}
