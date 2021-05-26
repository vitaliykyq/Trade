package edu.coursework.trade.service.Purchase.impls;

import edu.coursework.trade.model.Purchase;
import edu.coursework.trade.repository.PurchaseRepository;
import edu.coursework.trade.service.Purchase.interfaces.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public  Purchase create(Purchase purchase) {
        purchase.setCreatedAt(new Date());
        return repository.save(purchase);
    }

    @Override
    public Purchase update(Purchase purchase) {
        purchase.setModifiedAt(new Date());
        purchase.setCreatedAt(repository.findById(purchase.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(purchase);
        return purchase;
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
