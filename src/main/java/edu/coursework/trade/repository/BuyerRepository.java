package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuyerRepository extends MongoRepository<Buyer,String> {
}
