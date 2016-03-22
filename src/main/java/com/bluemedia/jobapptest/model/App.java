/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.model;

import com.bluemedia.jobapptest.model.StateLog;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.Indexed;

/**
 * Application and its properties
 * @author TEST
 */
@Entity
@Indexed
public class App {

    /**
     *  Enum represents current application state 
     */
    public static enum AppState {
        CREATED, VERIFIED, REJECTED, DELETED, ACCEPTED, PUBLISHED, UNKNOWN 
    };
    
    /*
    public static AppState stringToAppState(String appState)
    {
     switch (appState) {
         case "ACCEPTED":
             return AppState.ACCEPTED;
         case "CREATED":
             return AppState.CREATED;
         case "DELETED":
             return AppState.DELETED;
         case "PUBLISHED":
             return AppState.PUBLISHED;
         case "REJECTED":
             return AppState.REJECTED;
         case "VERIFIED":
             return AppState.VERIFIED;
         default:
             return AppState.UNKNOWN;
     }
    }*/
    
    private AppState currentState;
    private String name;
    private String content;
    private String removalReason;
    private Integer uniqueID;
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;  
    
    @OneToMany(mappedBy = "app",
                cascade = { CascadeType.PERSIST, CascadeType.MERGE },
                fetch = FetchType.EAGER)
    private Set<StateLog> history = new HashSet<>();
    
    public App () {
    }
    
    public App (String NewName, String NewContent) {
        this.name    = NewName;
        this.content = NewContent;
    }

    /**
     * @return the currentState
     */
    public AppState getCurrentState() {
        return currentState;
    }

    /**
     * @param currentState the currentState to set
     */
    public void setCurrentState(AppState currentState) {
        StateLog LogEntry = new StateLog(currentState,new Date());
        LogEntry.setApp(this);
        getHistory().add(LogEntry);
        this.currentState = currentState;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the removalReason
     */
    public String getRemovalReason() {
        return removalReason;
    }

    /**
     * @param removalReason the removalReason to set
     */
    public void setRemovalReason(String removalReason) {
        this.removalReason = removalReason;
    }

    /**
     * @return the uniqueID
     */
    public Integer getUniqueID() {
        return uniqueID;
    }

    /**
     * @param uniqueID the uniqueID to set
     */
    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the history
     */
    public Set<StateLog> getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(Set<StateLog> history) {
        this.history = history;
    }
    
}
