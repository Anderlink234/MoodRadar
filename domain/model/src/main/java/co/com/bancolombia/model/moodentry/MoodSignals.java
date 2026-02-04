package co.com.bancolombia.model.moodentry;
import lombok.*;
//import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoodSignals {

    private boolean lowMoodStreak;        // Varios días seguidos con ánimo bajo
    private boolean lowEnergyTrend;       // Tendencia de energía baja
    private boolean highAnxietyTrend;     // Ansiedad alta repetida
    private boolean sleepProblemTrend;    // Mal sueño frecuente
    private boolean socialWithdrawal;     // Aislamiento repetido
}
