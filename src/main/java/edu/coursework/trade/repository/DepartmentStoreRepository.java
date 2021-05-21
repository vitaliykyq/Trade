package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.DepartmentStore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentStoreRepository extends MongoRepository<DepartmentStore,String> {
}
