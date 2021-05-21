package edu.coursework.trade.repository;

import edu.coursework.trade.model.Tray;
import edu.coursework.trade.model.Utility;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtilityRepository extends MongoRepository<Utility,String> {
}
