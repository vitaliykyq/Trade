package edu.coursework.trade.service.Order;

import edu.coursework.trade.model.Order;
import edu.coursework.trade.repository.OrderRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderRepository repository;
    @Override
    public Order getById(String id) {
        return repository.findById(id).orElse(null);
    }


    @Override
    public Order create(Order order) {
        return repository.save(order);
    }

    @Override
    public Order update(Order order) {
        return repository.save(order);
    }

    @Override
    public Order delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }
}
