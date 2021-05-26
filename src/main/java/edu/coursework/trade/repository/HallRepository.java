package edu.coursework.trade.repository;

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Hall;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends MongoRepository<Hall,String> {
}
