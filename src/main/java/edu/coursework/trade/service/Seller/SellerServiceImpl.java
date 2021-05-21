package edu.coursework.trade.service.Seller;

import edu.coursework.trade.model.Seller;
import edu.coursework.trade.repository.SellerRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        return repository.save(seller);
    }

    @Override
    public Seller update(Seller seller) {
        return repository.save(seller);
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
