package edu.coursework.trade.service.Shop.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IShopService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Seller;
import edu.coursework.trade.model.Shop;

import java.util.List;

public interface IShopService {

    Shop getById(String id);
    Shop create(Shop shop);
    Shop update(Shop shop);
    Shop delete(String id);
    List<Shop> getAll();
}
