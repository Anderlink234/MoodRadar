package co.com.bancolombia.mongo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "mood_entries")
public class MoodEntryData {

    @Id
    private String id;
    private String userId;
    private String entryDate;
    private String createdAt;
    private String moodLevel;
    private String energyLevel;
    private String anxietyLevel;
    private String stressLevel;
    private String sleep;
    private String socialInteraction;
    private String notes;
    private String tags;
    private String signals;
}
