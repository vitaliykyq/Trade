package edu.coursework.trade.repository;

import edu.coursework.trade.model.Section;
import edu.coursework.trade.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerRepository extends MongoRepository<Seller,String> {
}
