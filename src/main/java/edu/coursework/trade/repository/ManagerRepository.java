package edu.coursework.trade.repository;

import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagerRepository extends MongoRepository<Manager,String> {
}
