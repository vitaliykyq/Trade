package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends MongoRepository<Buyer,String> {
}
