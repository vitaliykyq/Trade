package edu.coursework.trade.service.Utility;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IUtilityService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Tray;
import edu.coursework.trade.model.Utility;

import java.util.List;

public interface IUtilityService {

    Utility getById(String id);
    Utility create(Utility utility);
    Utility update(Utility utility);
    Utility delete(String id);
    List<Utility> getAll();
}
