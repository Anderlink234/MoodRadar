package co.com.bancolombia.model.moodentry;

import co.com.bancolombia.model.moodentry.enums.SocialLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SocialInteraction {
    private SocialLevel level;
}

