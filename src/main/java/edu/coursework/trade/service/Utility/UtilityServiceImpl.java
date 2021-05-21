package edu.coursework.trade.service.Utility;

import edu.coursework.trade.model.Utility;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UtilityServiceImpl implements IUtilityService {

    @Autowired
    UtilityRepository repository;

    @Override
    public Utility getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Utility create(Utility utility) {

        return repository.save(utility);
    }

    @Override
    public Utility update(Utility utility) {

        return repository.save(utility);
    }

    @Override
    public Utility delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Utility> getAll() {
        return repository.findAll();
    }
}
