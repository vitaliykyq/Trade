package edu.coursework.trade.service.Provider;

import edu.coursework.trade.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import edu.coursework.trade.model.Provider;
@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    ProviderRepository repository;
    @Override
    public edu.coursework.trade.model.Provider getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Provider create(Provider provider) {
        return repository.save(provider);
    }

    @Override
    public Provider update(Provider provider) {
        return repository.save(provider);
    }

    @Override
    public Provider delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Provider> getAll() {
        return repository.findAll();
    }
}
