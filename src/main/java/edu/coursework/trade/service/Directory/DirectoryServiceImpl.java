package edu.coursework.trade.service.Directory;

import edu.coursework.trade.model.Directory;
import edu.coursework.trade.repository.DirectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectoryServiceImpl implements IDirectoryService {
    @Autowired
    DirectoryRepository repository;
    @Override
    public Directory getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Directory create(Directory directory) {
        return repository.save(directory);
    }

    @Override
    public Directory update(Directory directory) {
        return repository.save(directory);
    }

    @Override
    public Directory delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Directory> getAll() {
        return repository.findAll();
    }
}
