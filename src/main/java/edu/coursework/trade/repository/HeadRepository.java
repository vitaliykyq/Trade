package edu.coursework.trade.repository;

import edu.coursework.trade.model.Head;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadRepository extends MongoRepository<Head,String> {
}
