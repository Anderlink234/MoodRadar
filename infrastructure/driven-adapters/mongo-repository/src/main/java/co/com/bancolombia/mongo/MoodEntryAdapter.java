package co.com.bancolombia.mongo;

import co.com.bancolombia.model.moodentry.MoodEntry;
import co.com.bancolombia.model.moodentry.gateways.MoodEntryRepository;
import co.com.bancolombia.mongo.entities.MoodEntryData;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.data.repository.reactive.ReactiveQueryByExampleExecutor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MoodEntryAdapter extends AdapterOperations<MoodEntry, MoodEntryData, String, MoodEntryMongoRepository> implements MoodEntryRepository {

    public MoodEntryAdapter(MoodEntryMongoRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, MoodEntry.class));
    }

    @Override
    public Mono<MoodEntry> save(MoodEntry moodEntry) {
        return super.save(moodEntry);
    }
}
