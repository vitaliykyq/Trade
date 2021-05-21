package edu.coursework.trade.service.Hall;

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.repository.HallRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HallServiceImpl implements IHallService {

    @Autowired
    HallRepository repository;
    @Override
    public Hall getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Hall create(Hall hall) {
        return repository.save(hall);
    }

    @Override
    public Hall update(Hall hall) {
        return repository.save(hall);
    }

    @Override
    public Hall delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Hall> getAll() {
        return repository.findAll();
    }
}
