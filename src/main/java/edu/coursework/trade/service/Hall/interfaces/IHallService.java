package edu.coursework.trade.service.Hall.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IHallService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Hall;

import java.util.List;

public interface IHallService {

    Hall getById(String id);
    Hall create(Hall hall);
    Hall update(Hall hall);
    Hall delete(String id);
    List<Hall> getAll();
}
