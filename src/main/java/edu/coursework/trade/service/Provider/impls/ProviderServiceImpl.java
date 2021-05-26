package edu.coursework.trade.service.Provider.impls;

import edu.coursework.trade.repository.ProviderRepository;
import edu.coursework.trade.service.Provider.interfaces.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        provider.setCreatedAt(new Date());
        return repository.save(provider);
    }

    @Override
    public Provider update(Provider provider) {
        provider.setModifiedAt(new Date());
        provider.setCreatedAt(repository.findById(provider.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(provider);
        return provider;
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
