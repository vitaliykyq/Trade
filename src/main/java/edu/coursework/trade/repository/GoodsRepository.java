package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.Goods;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoodsRepository extends MongoRepository<Goods,String> {
}
