package edu.coursework.trade.dao.goods.impls;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsDAOImpl 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.dao.goods.interfaces.IGoodsDAO;
import edu.coursework.trade.data.FakeData;
import edu.coursework.trade.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class GoodsDAOImpl implements IGoodsDAO {

    @Autowired
    FakeData fakeData;

    /*@Override
    public Goods getById(String id) {
        return null;
    }

    @Override
    public Goods create(Goods goods) {
        return null;
    }

    @Override
    public Goods update(Goods goods) {
        return null;
    }

    @Override
    public Goods delete(String id) {
        return null;
    }

    @Override
    public Goods save(Goods goods) {
        return null;
    }

    @Override
    public List<Goods> getAll() {
        return fakeData.getGoods();
    }*/

    @Override
    public Goods getById(String id) {
        return this.getAll().stream()
                .filter(goods -> goods.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Goods create(Goods goods) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId()))
                .max().orElse(0)+1);
        goods.setCreated_at(LocalDateTime.now());
        goods.setId(id);
        this.getAll().add(goods);
        return goods;
    }

    @Override
    public Goods update(Goods goods) {
        Goods updatedGoods = this.getById(goods.getId());
        updatedGoods.setKind(goods.getKind());
        updatedGoods.setPrice(goods.getPrice());
        updatedGoods.setAmount(goods.getAmount());
        updatedGoods.setDateOfManufacture(goods.getDateOfManufacture());
        updatedGoods.setExpirationDate(goods.getExpirationDate());
        updatedGoods.setModified_at(LocalDateTime.now());

        return updatedGoods;

    }

    @Override
    public Goods delete(String id) {
        Goods goods = this.getById(id);
        this.getAll().remove(goods);
        return goods;
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
