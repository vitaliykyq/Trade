package edu.coursework.trade.service.Directory.impls;

import edu.coursework.trade.model.Directory;
import edu.coursework.trade.repository.DirectoryRepository;
import edu.coursework.trade.service.Directory.interfaces.IDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        directory.setCreatedAt(new Date());
        return repository.save(directory);
    }

    @Override
    public Directory update(Directory directory) {
        directory.setModifiedAt(new Date());
        directory.setCreatedAt(repository.findById(directory.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(directory);
        return directory;
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
