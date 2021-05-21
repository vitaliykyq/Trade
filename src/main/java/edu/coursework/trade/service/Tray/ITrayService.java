package edu.coursework.trade.service.Tray;

/*
    @author:    Anton
    @project:    Trade 
    @class:    ITrayService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Shop;
import edu.coursework.trade.model.Tray;

import java.util.List;

public interface ITrayService {

    Tray getById(String id);
    Tray create(Tray tray);
    Tray update(Tray tray);
    Tray delete(String id);
    List<Tray> getAll();
}
