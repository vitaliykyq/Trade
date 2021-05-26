package edu.coursework.trade.service.Section.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    ISectionService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Section;

import java.security.Provider;
import java.util.List;

public interface ISectionService {

    Section getById(String id);
    Section create(Section section);
    Section update(Section section);
    Section delete(String id);
    List<Section> getAll();
}
