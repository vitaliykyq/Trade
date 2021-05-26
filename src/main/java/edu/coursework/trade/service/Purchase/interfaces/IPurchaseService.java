package edu.coursework.trade.service.Purchase.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IHallService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.model.Purchase;

import java.util.List;

public interface IPurchaseService {

    Purchase getById(String id);
    Purchase create(Purchase purchase);
    Purchase update(Purchase purchase);
    Purchase delete(String id);
    List<Purchase> getAll();
}
