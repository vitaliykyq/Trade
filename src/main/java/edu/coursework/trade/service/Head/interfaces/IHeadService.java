package edu.coursework.trade.service.Head.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IHallService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.model.Head;

import java.util.List;

public interface IHeadService {

    Head getById(String id);
    Head create(Head head);
    Head update(Head head);
    Head delete(String id);
    List<Head> getAll();
}
