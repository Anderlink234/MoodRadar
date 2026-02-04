package co.com.bancolombia.api;

import co.com.bancolombia.model.moodentry.MoodEntry;
import co.com.bancolombia.model.moodentry.enums.AnxietyLevel;
import co.com.bancolombia.model.moodentry.enums.EnergyLevel;
import co.com.bancolombia.model.moodentry.enums.MoodLevel;
import co.com.bancolombia.model.moodentry.enums.SleepQuality;
import co.com.bancolombia.model.moodentry.enums.StressLevel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class MoodEntryRequest {

    @NotBlank
    private String userId;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate entryDate;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;

    @NotNull
    private String moodLevel;

    @NotNull
    private String energyLevel;

    @NotNull
    private String anxietyLevel;

    @NotNull
    private String stressLevel;

    private SleepData sleep;

    private SocialInteraction socialInteraction;

    private String notes;

    private List<String> tags;

    private MoodSignals signals;

    @Data
    public static class SleepData {

        @Min(0)
        @Max(24)
        private Double hoursSlept;

        private String quality;
    }

    @Data
    public static class SocialInteraction {

        @NotNull
        private String level;
    }

    @Data
    public static class MoodSignals {

        private Boolean lowMoodStreak;
        private Boolean lowEnergyTrend;
        private Boolean highAnxietyTrend;
        private Boolean sleepProblemTrend;
        private Boolean socialWithdrawal;
    }

    public MoodEntry toDomain() {
        return MoodEntry.builder()
                .userId(userId)
                .entryDate(entryDate)
                .createdAt(createdAt)
                .moodLevel(MoodLevel.valueOf(moodLevel))
                .energyLevel(EnergyLevel.valueOf(energyLevel))
                .anxietyLevel(AnxietyLevel.valueOf(anxietyLevel))
                .stressLevel(StressLevel.valueOf(stressLevel))
                .sleep(sleep != null ? SleepData.builder()
                        .hoursSlept(sleep.getHoursSlept())
                        .quality(SleepQuality.valueOf(sleep.getQuality()))
                        .build() : null)
                .social(socialInteraction)
                .build();
    }
}
