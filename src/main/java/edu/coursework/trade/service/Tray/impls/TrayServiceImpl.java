package edu.coursework.trade.service.Tray.impls;

import edu.coursework.trade.model.Tray;
import edu.coursework.trade.repository.TrayRepository;
import edu.coursework.trade.service.Tray.interfaces.ITrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        tray.setCreatedAt(new Date());
        return repository.save(tray);
    }

    @Override
    public Tray update(Tray tray) {
        tray.setModifiedAt(new Date());
        tray.setCreatedAt(repository.findById(tray.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(tray);
        return tray;
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
