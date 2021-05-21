package edu.coursework.trade.service.Purchase;

import edu.coursework.trade.model.Purchase;
import edu.coursework.trade.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements IPurchaseService {

    @Autowired
    PurchaseRepository repository;
    @Override
    public  Purchase getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public  Purchase create( Purchase purchase) {
        return repository.save(purchase);
    }

    @Override
    public  Purchase update( Purchase purchase) {
        return repository.save(purchase);
    }

    @Override
    public  Purchase delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Purchase> getAll() {
        return repository.findAll();
    }
}
