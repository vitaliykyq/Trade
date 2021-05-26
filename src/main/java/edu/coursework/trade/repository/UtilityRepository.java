package edu.coursework.trade.repository;

import edu.coursework.trade.model.Tray;
import edu.coursework.trade.model.Utility;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityRepository extends MongoRepository<Utility,String> {
}
