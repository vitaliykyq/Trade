package edu.coursework.trade.service.Person;

import edu.coursework.trade.model.Person;
import edu.coursework.trade.repository.PersonRepository;
import edu.coursework.trade.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonRepository repository;

    @Override
    public Person getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {
        return repository.save(person);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public Person delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }
}
