package edu.coursework.trade.repository;

import edu.coursework.trade.model.Section;
import edu.coursework.trade.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller,String> {
}
