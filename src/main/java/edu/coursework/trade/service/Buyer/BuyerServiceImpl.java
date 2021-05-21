package edu.coursework.trade.service.Buyer;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.repository.BuyerRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements IBuyerService {


    @Autowired
    BuyerRepository repository;
    @Override
    public Buyer getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Buyer create(Buyer buyer) {
        return repository.save(buyer);
    }

    @Override
    public Buyer update(Buyer buyer) {
        return repository.save(buyer);
    }

    @Override
    public Buyer delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Buyer> getAll() {
        return repository.findAll();
    }
}
