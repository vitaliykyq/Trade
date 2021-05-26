package edu.coursework.trade.repository;

import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Kiosk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KioskRepository extends MongoRepository<Kiosk,String> {
}
