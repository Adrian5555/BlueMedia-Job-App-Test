/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest.rest;

import com.bluemedia.jobapptest.model.App;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 *
 * @author TEST
 */
@Mapper(uses = UriMapper.class, componentModel = "cdi", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ResourceMapper {
    
    @Mapping(target = "history", ignore = true)
    public AppDocument toAppDocument(App app);
    
    public List<AppDocument> toAppDocuments(Iterable<App> apps);

    @Mapping(target = "history", ignore = true)
    public App toApp(AppDocument appDocument);
}
