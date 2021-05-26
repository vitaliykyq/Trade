package edu.coursework.trade.service.Seller.impls;

import edu.coursework.trade.model.Seller;
import edu.coursework.trade.repository.SellerRepository;
import edu.coursework.trade.service.Seller.interfaces.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SellerServiceImpl implements ISellerService {

    @Autowired
    SellerRepository repository;
    @Override
    public Seller getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Seller create(Seller seller) {
        seller.setCreatedAt(new Date());
        return repository.save(seller);
    }

    @Override
    public Seller update(Seller seller) {
        seller.setModifiedAt(new Date());
        seller.setCreatedAt(repository.findById(seller.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(seller);
        return seller;
    }

    @Override
    public Seller delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Seller> getAll() {
        return repository.findAll();
    }
}
