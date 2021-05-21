package edu.coursework.trade.service.Shop;

import edu.coursework.trade.model.Shop;
import edu.coursework.trade.repository.ShopRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements IShopService {
    @Autowired
    ShopRepository repository;
    @Override
    public Shop getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Shop create(Shop shop) {
        return repository.save(shop);
    }

    @Override
    public Shop update(Shop shop) {
        return repository.save(shop);
    }

    @Override
    public Shop delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Shop> getAll() {
        return repository.findAll();
    }
}
