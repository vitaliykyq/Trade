package edu.coursework.trade.service.Section;

import edu.coursework.trade.model.Section;
import edu.coursework.trade.repository.SectionRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SectionServiceImpl implements ISectionService {
    @Autowired
    SectionRepository repository;

    @Override
    public Section getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Section create(Section section) {
        return repository.save(section);
    }

    @Override
    public Section update(Section section) {
        return repository.save(section);
    }

    @Override
    public Section delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Section> getAll() {
        return repository.findAll();
    }
}
