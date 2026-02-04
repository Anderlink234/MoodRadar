package co.com.bancolombia.usecase.moodentry;

import co.com.bancolombia.model.moodentry.MoodEntry;
import co.com.bancolombia.model.moodentry.gateways.MoodEntryRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class MoodEntryUseCase {

    private final MoodEntryRepository moodEntryRepository;

    public Mono<MoodEntry> createMoodEntry(MoodEntry moodEntry) {
        return moodEntryRepository.save(moodEntry);
    }
}
