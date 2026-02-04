package co.com.bancolombia.model.moodentry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MoodEntryTest {

    @Test
    void testMoodEntryCreation() {
        MoodEntry moodEntry = MoodEntry.builder()
                .userId("test-user")
                .build();
        assertNotNull(moodEntry);
    }
}
