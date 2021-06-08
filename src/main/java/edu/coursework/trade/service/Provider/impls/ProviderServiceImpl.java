package edu.coursework.trade.service.Provider.impls;

import edu.coursework.trade.repository.ProviderRepository;
import edu.coursework.trade.service.Provider.interfaces.IProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import static org.springframework.data.mongodb.core.aggregation.Fields.fields;

import java.util.Date;
import java.util.List;
import edu.coursework.trade.model.Provider;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    ProviderRepository repository;

    private final MongoTemplate mongoTemplate;
    @Override
    public edu.coursework.trade.model.Provider getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Provider create(Provider provider) {
        provider.setCreatedAt(new Date());
        return repository.save(provider);
    }

    @Override
    public Provider update(Provider provider) {
        provider.setModifiedAt(new Date());
        provider.setCreatedAt(repository.findById(provider.getId())
                .orElse(null)
                .getCreatedAt());
        repository.save(provider);
        return provider;
    }

    @Override
    public Provider delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Provider> getAll() {
        return repository.findAll();
    }

    public Object getProviderGoods(String kind) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.kind").is(kind)));
        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
    public Object getProviderGoodsAmount(int amount) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.amount").is(amount)));
        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
    public Object getNumOfProvidersWithAmount(int amount) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.amount").is(amount)));
        Aggregation.group(fields().and("amount")).count().as("numOfProviders");

        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
    public Object getProvidersWithCertainGoodsAmount(int amount, String kind) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.amount").is(amount).and("goods.kind").is(kind)));
        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
    public Object getNumOfProvidersWithCertainGoods(String kind) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.kind").is(kind)));
        Aggregation.group(fields().and("kind")).count().as("numOfProviders");

        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
    public Object getNumOfProvidersWithCertainGoodsAmount(int amount, String kind) {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("goods.amount").is(amount).and("goods.kind").is(kind)));
        Aggregation.group(fields().and("amount")).count().as("numOfProviders");

        return mongoTemplate.aggregate(aggregation, "provider", Object.class).getMappedResults();
    }
}
