package edu.coursework.trade.repository;

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.model.Head;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeadRepository extends MongoRepository<Head,String> {
}
