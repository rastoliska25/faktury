package faktury.faktury;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/invoices")
public class
WebClientController {

    @Autowired
    WebClientService webClientService;

    @GetMapping(value = "/invoice", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Flux<Invoice> findAllUsers() {
        return webClientService.findInvoices();
    }

    /*
    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<User> getUserById(@PathVariable Long id) {
        return webClientService.findUserById(id);
    }

    @GetMapping(value = "/user", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Flux<User> findAllUsers() {
        return webClientService.findUsers();
    }

     */


}
