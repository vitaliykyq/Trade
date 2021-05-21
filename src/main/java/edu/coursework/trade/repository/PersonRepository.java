package edu.coursework.trade.repository;

import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String> {
}
