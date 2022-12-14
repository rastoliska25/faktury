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

    public Flux<Invoice> findInvoice(Integer id) {
        return this.webClient.get().uri("/api/v2/IssuedInvoices/" + id)
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(Invoice.class);
    }

    public Flux<Data> findInvoices() {
        return this.webClient.get().uri("/api/v2/IssuedInvoices")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(Data.class);
    }

}