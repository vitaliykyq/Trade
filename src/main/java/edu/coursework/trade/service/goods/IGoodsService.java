package edu.coursework.trade.service.goods;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IGoodsService 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;

import java.util.List;

public interface IGoodsService {

    Goods getById(String id);
    Goods create(Goods goods);
    Goods update(Goods goods);
    Goods delete(String id);
    Goods save(Goods goods);
    List<Goods> getAll();
}
