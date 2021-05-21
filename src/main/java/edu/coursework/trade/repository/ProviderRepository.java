package edu.coursework.trade.repository;

import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProviderRepository extends MongoRepository<Provider,String> {
}
