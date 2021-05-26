package edu.coursework.trade.service.DepartmentStore.impls;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsServiceImpl 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.DepartmentStore;
import edu.coursework.trade.repository.DepartmentStoreRepository;
import edu.coursework.trade.service.DepartmentStore.interfaces.IDepartmentStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        store.setCreatedAt(new Date());
        return repository.save(store);
    }

    @Override
    public DepartmentStore update(DepartmentStore store) {
        store.setModifiedAt(new Date());
        store.setCreatedAt(repository.findById(store.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(store);
        return store;
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
