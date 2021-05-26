package edu.coursework.trade.repository;

import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Section;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends MongoRepository<Section,String> {
}
