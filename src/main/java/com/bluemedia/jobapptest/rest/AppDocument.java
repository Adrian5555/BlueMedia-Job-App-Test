/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.rest;

import com.bluemedia.jobapptest.model.App.AppState;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author TEST
 */
public class AppDocument {
    
    private AppState currentState;
    private String name;
    private String content;
    private String removalReason;
    private Integer uniqueID;
    private Set<URI> history = new HashSet<>();

    /**
     * @return the currentState
     */
    public AppState getCurrentState() {
        return currentState;
    }

    /**
     * @param CurrentState the currentState to set
     */
    public void setCurrentState(AppState CurrentState) {
        this.currentState = CurrentState;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param Content the content to set
     */
    public void setContent(String Content) {
        this.content = Content;
    }

    /**
     * @return the removalReason
     */
    public String getRemovalReason() {
        return removalReason;
    }

    /**
     * @param RemovalReason the removalReason to set
     */
    public void setRemovalReason(String RemovalReason) {
        this.removalReason = RemovalReason;
    }

    /**
     * @return the uniqueID
     */
    public Integer getUniqueID() {
        return uniqueID;
    }

    /**
     * @param UniqueID the uniqueID to set
     */
    public void setUniqueID(Integer UniqueID) {
        this.uniqueID = UniqueID;
    }

    /**
     * @return the history
     */
    public Set<URI> getHistory() {
        return history;
    }

    /**
     * @param History the history to set
     */
    public void setHistory(Set<URI> History) {
        this.history = History;
    }
    
    
}
