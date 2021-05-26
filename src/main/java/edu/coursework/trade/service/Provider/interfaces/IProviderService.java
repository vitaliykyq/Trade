package edu.coursework.trade.service.Provider.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IProviderService
    @version:    1.0.0 
    @since:    15.04.2021     
*/


import edu.coursework.trade.model.Provider;

import java.util.List;

public interface IProviderService {

    edu.coursework.trade.model.Provider getById(String id);
    Provider create(Provider provider);
    Provider update(Provider provider);
    Provider delete(String id);
    List<Provider> getAll();
}
