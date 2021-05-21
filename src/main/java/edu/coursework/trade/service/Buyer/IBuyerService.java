package edu.coursework.trade.service.Buyer;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IDepartmentStoreService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.DepartmentStore;

import java.util.List;

public interface IBuyerService {

    Buyer getById(String id);
    Buyer create(Buyer buyer);
    Buyer update(Buyer buyer);
    Buyer delete(String id);
    List<Buyer> getAll();
}
