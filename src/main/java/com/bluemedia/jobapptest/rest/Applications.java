/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.rest;

import com.bluemedia.jobapptest.AppManager;
import com.bluemedia.jobapptest.model.App;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//import javax.ws.rs.core.Response.Status;

/**
 *
 * @author TEST
 */
@Path("/apps")
@Stateless
@Produces("application/json")
@Consumes("application/json")
public class Applications {

    @Inject
    private AppManager appMgr = new AppManager();

    @Inject
    private ResourceMapper mapper;

    @Inject
    private UriMapper uris;
        
    @Context
    private UriInfo uriInfo;
        
    public Applications() {
    }

    @GET
    @Path("/")
    public Response listApps() {
        //TODO MOVE TO SINGLETON
        List<App> apps = appMgr.getAllApps();
        List<AppDocument> appDocuments = mapper.toAppDocuments( apps );
        for(App app : apps) {
            System.out.println("| " +app.getName() + " | " + app.getContent() + " | " + app.getCurrentState()  +" |");
        }
        return Response.ok( appDocuments ).build();
    }

    /* 
    @POST
    @Path("/")
    public Response createApp(AppDocument request) {
    App app = appMgr.createApp(request.getName(), request.getContent());       
        return Response.created( uris.toUri( app ) ).build();
    } 
    */
        
        
    /*
    @GET
    @Path("/{id}")
    public Response getApp(@PathParam("id") String id) {
        App app = appMgr.getAppById(id);
        if ( app == null ) {
            return Response.status( Status.NOT_FOUND ).build();
        } else {
            return Response.ok( mapper.toAppDocument( app ) ).build();
        }
    }
    */
        
    @RequestScoped
    @javax.enterprise.inject.Produces
    public UriInfo produceUriInfo() {
    	return uriInfo;
    }
}
