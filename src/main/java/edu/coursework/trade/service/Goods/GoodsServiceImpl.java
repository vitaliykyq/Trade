package edu.coursework.trade.service.Goods;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsServiceImpl 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.dao.goods.impls.GoodsDAOImpl;
import edu.coursework.trade.data.FakeData;
import edu.coursework.trade.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    FakeData fakeData;

    @Autowired
    GoodsDAOImpl dao;

    @Override
    public Goods getById(String id) {
        return dao.getById(id);
    }

    @Override
    public Goods create(Goods goods) {
        return dao.create(goods);
    }

    @Override
    public Goods update(Goods goods) {
        return dao.update(goods);
    }

    @Override
    public Goods delete(String id) {
        return dao.delete(id);
    }

    @Override
    public Goods save(Goods goods) {
        return null;
    }

    @Override
    public List<Goods> getAll() {
        return fakeData.getGoods();
    }
}
