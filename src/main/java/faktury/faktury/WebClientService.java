package faktury.faktury;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class WebClientService {
    private final WebClient webClient;

    static String token = null;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://app.idoklad.cz/developer").build();
    }

    public Flux<Invoice> findInvoice() {
        return this.webClient.get().uri("/api/v2/IssuedInvoices/33759727")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(Invoice.class);
    }

    public Flux<Invoice> findInvoices() {
        return this.webClient.get().uri("/api/v2/IssuedInvoices")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(Invoice.class);
    }

}