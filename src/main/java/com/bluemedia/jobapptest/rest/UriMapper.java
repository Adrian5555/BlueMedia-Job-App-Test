/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.rest;

import com.bluemedia.jobapptest.model.App;
import java.net.URI;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import org.mapstruct.TargetType;

/**
 *
 * @author TEST
 */
@ApplicationScoped
public class UriMapper {
    
    @Inject
    private UriInfo uriInfo;

    @PersistenceContext
    private EntityManager entityManager;

    public URI toUri(App app) {
        return UriBuilder.fromUri( uriInfo.getBaseUri() ).path( Applications.class ).path( "/{id}" ).build( app.getId() );
    }

    public <T> T load(URI uri, @TargetType Class<T> entityType) {
        String id = toId( uri );
        return entityManager.find( entityType, id );
    }

    public String toId(URI uri) {
        String path = uri.getPath();
        return path.substring( path.lastIndexOf( "/" ) + 1 );
    }    
}
