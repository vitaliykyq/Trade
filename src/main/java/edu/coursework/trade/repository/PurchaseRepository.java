package edu.coursework.trade.repository;

import edu.coursework.trade.model.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Purchase,String> {
}
