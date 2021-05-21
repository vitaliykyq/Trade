package edu.coursework.trade.service.Person;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IPersonService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Person;

import java.util.List;

public interface IPersonService {

    Person getById(String id);
    Person create(Person person);
    Person update(Person person);
    Person delete(String id);
    List<Person> getAll();
}
