package edu.coursework.trade.service.Kiosk;

import edu.coursework.trade.model.Kiosk;
import edu.coursework.trade.repository.KioskRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KioskServiceImpl implements IKioskService {
    @Autowired
    KioskRepository repository;
    @Override
    public Kiosk getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Kiosk create(Kiosk kiosk) {

        return repository.save(kiosk);
    }

    @Override
    public Kiosk update(Kiosk kiosk) {

        return repository.save(kiosk);
    }

    @Override
    public Kiosk delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Kiosk> getAll() {
        return repository.findAll();
    }
}
