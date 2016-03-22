package com.bluemedia.jobapptest.rest;

import com.bluemedia.jobapptest.model.App;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-03-22T05:42:57-0700",
    comments = "version: 1.0.0.Beta4, compiler: javac, environment: Java 1.8.0_73 (Oracle Corporation)"
)
@ApplicationScoped
public class ResourceMapperImpl implements ResourceMapper {

    @Override
    public AppDocument toAppDocument(App app) {
        if ( app == null ) {
            return null;
        }

        AppDocument appDocument = new AppDocument();

        appDocument.setName( app.getName() );
        appDocument.setCurrentState( app.getCurrentState() );
        appDocument.setContent( app.getContent() );
        appDocument.setUniqueID( app.getUniqueID() );
        appDocument.setRemovalReason( app.getRemovalReason() );

        return appDocument;
    }

    @Override
    public List<AppDocument> toAppDocuments(Iterable<App> apps) {
        if ( apps == null ) {
            return null;
        }

        List<AppDocument> list = new ArrayList<AppDocument>();

        for ( App app : apps ) {
            list.add( toAppDocument( app ) );
        }

        return list;
    }

    @Override
    public App toApp(AppDocument appDocument) {
        if ( appDocument == null ) {
            return null;
        }

        App app = new App();

        app.setName( appDocument.getName() );
        app.setCurrentState( appDocument.getCurrentState() );
        app.setContent( appDocument.getContent() );
        app.setUniqueID( appDocument.getUniqueID() );
        app.setRemovalReason( appDocument.getRemovalReason() );

        return app;
    }

}
