package edu.coursework.trade.service.Tray;

import edu.coursework.trade.model.Tray;
import edu.coursework.trade.repository.TrayRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrayServiceImpl implements ITrayService {

    @Autowired
    TrayRepository repository;

    @Override
    public Tray getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Tray create(Tray tray) {
        return repository.save(tray);
    }

    @Override
    public Tray update(Tray tray) {
        return repository.save(tray);
    }

    @Override
    public Tray delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Tray> getAll() {
        return repository.findAll();
    }
}
