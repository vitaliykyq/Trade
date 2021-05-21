package edu.coursework.trade.dao.goods.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IGoodsDAO 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;

import java.util.List;

public interface IGoodsDAO {

    Goods getById(String id);
    Goods create(Goods goods);
    Goods update(Goods goods);
    Goods delete(String id);
    Goods save(Goods goods);
    List<Goods> getAll();
}
