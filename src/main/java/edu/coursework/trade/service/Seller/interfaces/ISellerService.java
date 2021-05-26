package edu.coursework.trade.service.Seller.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    ISellerService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Section;
import edu.coursework.trade.model.Seller;

import java.util.List;

public interface ISellerService {

    Seller getById(String id);
    Seller create(Seller seller);
    Seller update(Seller seller);
    Seller delete(String id);
    List<Seller> getAll();
}
