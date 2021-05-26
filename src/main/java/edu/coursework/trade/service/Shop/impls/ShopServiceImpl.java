package edu.coursework.trade.service.Shop.impls;

import edu.coursework.trade.model.Shop;
import edu.coursework.trade.repository.ShopRepository;
import edu.coursework.trade.service.Shop.interfaces.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        shop.setCreatedAt(new Date());
        return repository.save(shop);
    }

    @Override
    public Shop update(Shop shop) {
        shop.setModifiedAt(new Date());
        shop.setCreatedAt(repository.findById(shop.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(shop);
        return shop;
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
