package co.com.bancolombia.mongo;

import co.com.bancolombia.mongo.entities.MoodEntryData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MoodEntryMongoRepository extends ReactiveCrudRepository<MoodEntryData, String> {
}
