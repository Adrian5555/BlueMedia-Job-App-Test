/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest;

import com.bluemedia.jobapptest.model.App;
import com.bluemedia.jobapptest.model.StateLog;
import java.util.List;
import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import org.hibernate.annotations.Entity;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceUnit;

/**
 *
 * @author TEST
 */
@Entity
@ApplicationScoped
public class AppManager {
      
    @PersistenceContext
    private EntityManager entityManager;
    
    /**
     * Performs basic validation before App is created
     * 
     * @param[in] Name     - App new name
     * @param[in] Content  - App new content
     * 
     * @return True if validation passed 
     *         False if validation failed
     */    
    private boolean validateApp (String Name, String Content) {
        if(Name.trim().isEmpty() || Content.trim().isEmpty())
            return false;
        return true;
    } 
    
    
    /**
     * Created new App regardless of validation results, even deleted apps are kept in DB
     * 
     * @param[in] Name     - App new name
     * @param[in] Content  - App new content
     * 
     * @return newly created APP
     */   
    public App createApp (String Name, String Content) {
        App newApp = new App(Name, Content);
        if(validateApp(Name, Content)) {
            newApp.setCurrentState(App.AppState.CREATED);
        } else {
            newApp.setCurrentState(App.AppState.DELETED);
            newApp.setRemovalReason("Basic validation Failed");
        }
        entityManager.persist( newApp );
        return newApp;
    }
    
    public void rejectApp (String Id, String Reason) {
        //throw new Not Implemented Exception
    }
    
    public void acceptApp (String Id) {
        //throw new Not Implemented Exception
    }
            
    public void publishApp (String Id) {
        //throw new Not Implemented Exception
    }       
    
    public AppManager () {
        //No longer required
        //entityManagerFactory = Persistence.createEntityManagerFactory("AppPu");
        //entityManager = entityManagerFactory.createEntityManager();
        //entityManager.getTransaction().begin();
    }
    
    public void End () {
        //No longer required
        //entityManager.getTransaction().commit();
        //entityManagerFactory.close();
    }
    
    public App getAppById(String id) {
        App app = entityManager.createQuery( "SELECT h FROM App h WHERE h.id LIKE :MyId", App.class ).setParameter("MyId",id).getResultList().get(0);
        return app;
    }
    
    public List<App> getAllApps () {
        List<App> apps = entityManager.createQuery( "SELECT h FROM App h ORDER BY h.id ASC" , App.class ).getResultList();
        return apps;
    }
    
    public List<StateLog> printHistoryById (String Id) {
        List<StateLog> logs = entityManager.createQuery( "SELECT h FROM StateLog h WHERE h.app.id LIKE :MyId" , StateLog.class ).setParameter("MyId",Id).getResultList();
        return logs;
    }
}
