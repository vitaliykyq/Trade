package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.DepartmentStore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentStoreRepository extends MongoRepository<DepartmentStore,String> {
}
