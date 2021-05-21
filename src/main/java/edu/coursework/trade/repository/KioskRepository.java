package edu.coursework.trade.repository;

import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Kiosk;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KioskRepository extends MongoRepository<Kiosk,String> {
}
