package edu.coursework.trade.service.Kiosk.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IKioskService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Kiosk;

import java.util.List;

public interface IKioskService {

    Kiosk getById(String id);
    Kiosk create(Kiosk kiosk);
    Kiosk update(Kiosk kiosk);
    Kiosk delete(String id);
    List<Kiosk> getAll();
}
