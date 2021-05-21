package edu.coursework.trade.service.DepartmentStore;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsServiceImpl 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.dao.goods.impls.GoodsDAOImpl;
import edu.coursework.trade.data.FakeData;
import edu.coursework.trade.model.DepartmentStore;
import edu.coursework.trade.model.Goods;
import edu.coursework.trade.repository.BuyerRepository;
import edu.coursework.trade.repository.DepartmentStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentStoreServiceImpl implements IDepartmentStoreService {

    @Autowired
    DepartmentStoreRepository repository;

    @Override
    public DepartmentStore getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public DepartmentStore create(DepartmentStore store) {
        return repository.save(store);
    }

    @Override
    public DepartmentStore update(DepartmentStore store) {
        return repository.save(store);
    }

    @Override
    public DepartmentStore delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<DepartmentStore> getAll() {
        return repository.findAll();
    }
}
