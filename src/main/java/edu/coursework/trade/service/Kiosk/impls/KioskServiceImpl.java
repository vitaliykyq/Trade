package edu.coursework.trade.service.Kiosk.impls;

import edu.coursework.trade.model.Kiosk;
import edu.coursework.trade.repository.KioskRepository;
import edu.coursework.trade.service.Kiosk.interfaces.IKioskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        kiosk.setCreatedAt(new Date());
        return repository.save(kiosk);
    }

    @Override
    public Kiosk update(Kiosk kiosk) {
        kiosk.setModifiedAt(new Date());
        kiosk.setCreatedAt(repository.findById(kiosk.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(kiosk);
        return kiosk;
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
