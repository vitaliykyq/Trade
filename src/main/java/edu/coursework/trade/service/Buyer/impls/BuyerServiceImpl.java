package edu.coursework.trade.service.Buyer.impls;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.repository.BuyerRepository;
import edu.coursework.trade.service.Buyer.interfaces.IBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        buyer.setCreatedAt(new Date());
        return repository.save(buyer);
    }

    @Override
    public Buyer update(Buyer buyer) {
        buyer.setModifiedAt(new Date());
        buyer.setCreatedAt(repository.findById(buyer.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(buyer);
        return buyer;
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
