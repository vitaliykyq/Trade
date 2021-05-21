package edu.coursework.trade.service.Manager;

import edu.coursework.trade.model.Manager;
import edu.coursework.trade.repository.ManagerRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    ManagerRepository repository;

    @Override
    public Manager getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Manager create(Manager manager) {
        return repository.save(manager);
    }

    @Override
    public Manager update(Manager manager) {
        return repository.save(manager);
    }

    @Override
    public Manager delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Manager> getAll() {
        return repository.findAll();
    }
}
