package edu.coursework.trade.service.Order;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IManagerService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Manager;
import edu.coursework.trade.model.Order;

import java.util.List;

public interface IOrderService {

    Order getById(String id);
    Order create(Order order);
    Order update(Order order);
    Order delete(String id);
    List<Order> getAll();
}
