package co.com.bancolombia.model.moodentry;
import co.com.bancolombia.model.moodentry.enums.AnxietyLevel;
import co.com.bancolombia.model.moodentry.enums.EnergyLevel;
import co.com.bancolombia.model.moodentry.enums.MoodLevel;
import co.com.bancolombia.model.moodentry.enums.StressLevel;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MoodEntry {

    private String id;

    private String userId;                 // Dueño del registro

    private LocalDate entryDate;           // Día al que pertenece el registro
    private LocalDateTime createdAt;       // Momento exacto en que se guardó

    // 📊 Estado emocional principal
    private MoodLevel moodLevel;           // Estado de ánimo general
    private EnergyLevel energyLevel;       // Nivel de energía
    private AnxietyLevel anxietyLevel;     // Nivel de ansiedad
    private StressLevel stressLevel;       // Nivel de estrés

    // 😴 Hábitos relacionados
    private SleepData sleep;               // Información de sueño
    private SocialInteraction social;      // Interacción social del día

    // 📝 Parte reflexiva
    private String notes;                  // Texto libre
    private List<String> tags;             // Ej: ["trabajo", "familia", "salud"]

    // 🧠 Señales detectadas (rellenado por backend, no por el usuario)
    private MoodSignals signals;



}

