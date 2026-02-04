package co.com.bancolombia.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class MoodEntryRouter {

    @Value("${api.mood-entry.path}")
    private String moodEntryPath;

    @Bean
    public RouterFunction<ServerResponse> moodEntryRoutes(MoodEntryHandler handler) {
        return route(POST(moodEntryPath), handler::createMoodEntry);
    }
}
