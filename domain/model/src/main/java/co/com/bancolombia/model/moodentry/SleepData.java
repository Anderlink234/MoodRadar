package co.com.bancolombia.model.moodentry;

import co.com.bancolombia.model.moodentry.enums.SleepQuality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SleepData {
    private Double hoursSlept;     // Ej: 6.5
    private SleepQuality quality;  // Cómo percibió el descanso
}

