package co.com.bancolombia.api;

import co.com.bancolombia.usecase.moodentry.MoodEntryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MoodEntryHandler {

    private final MoodEntryUseCase moodEntryUseCase;

    public Mono<ServerResponse> createMoodEntry(ServerRequest request) {
        return request.bodyToMono(MoodEntryRequest.class)
                .flatMap(moodEntryRequest -> moodEntryUseCase.createMoodEntry(moodEntryRequest.toDomain())
                        .flatMap(moodEntry -> ServerResponse.status(HttpStatus.CREATED).build())
                        .onErrorResume(e -> ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).build()));
    }
}
