/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.model;

import com.bluemedia.jobapptest.model.App.AppState;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.search.annotations.Indexed;
/**
 * Holds every state history when AppState is changed
 * 
 * @author TEST
 */
@Entity
@Indexed
public class StateLog {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Temporal( TemporalType.DATE )
    private Date appDate;
    private AppState appState;
    
    @ManyToOne
    private App app;
            
    public StateLog () {
    }
    
    public StateLog (AppState NewState, Date NewDate) {
        this.appState = NewState;
        this.appDate = NewDate;
    }
    
    public String getId() {
	return id;
    }

    public void setId(String Id) {
	this.id = Id;
    }
    
    public App getApp() {
	return app;
    }

    public void setApp(App AppLogs) {
	this.app = AppLogs;
    }
    
    public Date getDate() {
	return appDate;
    }

    //public void setDate(Date date) {
    //	this.appDate = date;
    //}

    public AppState getAppState() {
	return appState;
    }
}
