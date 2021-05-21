package edu.coursework.trade.service.DepartmentStore;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IGoodsService 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.DepartmentStore;
import edu.coursework.trade.model.Goods;

import java.util.List;

public interface IDepartmentStoreService {

    DepartmentStore getById(String id);
    DepartmentStore create(DepartmentStore store);
    DepartmentStore update(DepartmentStore store);
    DepartmentStore delete(String id);
    List<DepartmentStore> getAll();
}
