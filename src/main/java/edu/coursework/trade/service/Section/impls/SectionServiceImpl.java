package edu.coursework.trade.service.Section.impls;

import edu.coursework.trade.model.Section;
import edu.coursework.trade.repository.SectionRepository;
import edu.coursework.trade.service.Section.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        section.setCreatedAt(new Date());
        return repository.save(section);
    }

    @Override
    public Section update(Section section) {
        section.setModifiedAt(new Date());
        section.setCreatedAt(repository.findById(section.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(section);
        return section;
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
