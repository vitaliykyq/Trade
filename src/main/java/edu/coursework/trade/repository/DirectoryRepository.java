package edu.coursework.trade.repository;

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.Directory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DirectoryRepository extends MongoRepository<Directory,String> {
}
