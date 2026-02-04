package co.com.bancolombia.model.moodentry.gateways;

import co.com.bancolombia.model.moodentry.MoodEntry;
import reactor.core.publisher.Mono;

public interface MoodEntryRepository {
    Mono<MoodEntry> save(MoodEntry moodEntry);
}
