package faktury.faktury;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class WebClientService {
    private final WebClient webClient;

    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImEzck1VZ01Gdjl0UGNsTGE2eUYzekFrZnF1RSIsImtpZCI6ImEzck1VZ01Gdjl0UGNsTGE2eUYzekFrZnF1RSJ9.eyJpc3MiOiJodHRwczovL2lkc3J2My5jb20iLCJhdWQiOiJodHRwczovL2lkc3J2My5jb20vcmVzb3VyY2VzIiwiZXhwIjoxNjYzMDc3NjY5LCJuYmYiOjE2NjMwNzE2NjksImNsaWVudF9pZCI6IjA5ZWNkMjBlLTJiMjktNGEwMy1hZjY2LTc5NGVmM2ExOTdlYSIsInNjb3BlIjoiaWRva2xhZF9hcGkiLCJhcGlfbW9kdWxlIjoiIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZW1haWxhZGRyZXNzIjoicmFzdG8ubGlza2EyNUBnbWFpbC5jb20iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoicmFzdG8ubGlza2EyNUBnbWFpbC5jb20iLCJsaWNlbnNlX3N0YXR1cyI6Ik9rIiwidXNlcl9pZCI6IjUzMDE4NyIsImFnZW5kYV9pZCI6IjUzNDc5MiIsImNvdW50cnlfaWQiOiIxIiwiYWN0dWFsX21vZHVsZXMiOiIwMTExMTExMTExMTExMTExMTExMTExMDExMTExMTExMTExMUYxMTExMTExMDEwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwIiwidXNlcl9yaWdodHMiOiJBZG1pbiJ9.HkhvumjuXsEoY1k8FUCeLH4n75gLvg4eptzjz_RDgppjbME_BfT8r_9SF0dEH_R7IA0o8BrAZ0Wc4ayt7L-0r2hlaOEdpyZEPJS8VR_iHbLQI4_zobXqIsHDKRgEL5n5sg0f89ggEjVetbrm-CI4I2lnsO0W4dHTc4nZPbRbqY57TCMMavrvnivsYBO8uUToFFQY9ACofE4W1a7FaNdfaINsi4oxRmlRxt9TQAii7Obb_pnoU0LUuCgZ2Og7X88mHgzKiWHMf0iEuYlgwG57nFbGVmXDw9mLWQyK-dbouxkIiCJPgsjXdyjSU6MBUoVHMvDnMsvN5G3hQhxN1kl0MQ";

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://app.idoklad.cz/developer").build();
    }

    public Flux<Invoice> findInvoices() {
        return this.webClient.get().uri("/api/v2/IssuedInvoices/33759727")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(Invoice.class);
    }

    /*
    public Flux<User> findUsers() {
        return this.webClient.get().uri("/user")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToFlux(User.class);
    }

     */

    /*
    public Mono<User> findUserById(Long id) {
        return this.webClient.get().uri("/user/{id}", id)
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToMono(User.class);
    }

     */
}