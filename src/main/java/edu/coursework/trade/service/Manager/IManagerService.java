package edu.coursework.trade.service.Manager;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IManagerService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Kiosk;
import edu.coursework.trade.model.Manager;

import java.util.List;

public interface IManagerService {

    Manager getById(String id);
    Manager create(Manager manager);
    Manager update(Manager manager);
    Manager delete(String id);
    List<Manager> getAll();
}
