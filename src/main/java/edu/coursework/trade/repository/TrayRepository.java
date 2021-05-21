package edu.coursework.trade.repository;

import edu.coursework.trade.model.Shop;
import edu.coursework.trade.model.Tray;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrayRepository extends MongoRepository<Tray,String> {
}
