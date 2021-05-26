package edu.coursework.trade.repository;

import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends MongoRepository<Provider,String> {
}
