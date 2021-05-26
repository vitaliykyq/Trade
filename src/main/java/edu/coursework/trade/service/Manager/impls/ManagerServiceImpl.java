package edu.coursework.trade.service.Manager.impls;

import edu.coursework.trade.model.Manager;
import edu.coursework.trade.repository.ManagerRepository;
import edu.coursework.trade.service.Manager.interfaces.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        manager.setCreatedAt(new Date());
        return repository.save(manager);
    }

    @Override
    public Manager update(Manager manager) {
        manager.setModifiedAt(new Date());
        manager.setCreatedAt(repository.findById(manager.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(manager);
        return manager;
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
