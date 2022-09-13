package faktury.faktury;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoices")
public class
WebClientController {

    @Autowired
    WebClientService webClientService;

    @GetMapping(value = "/invoice", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Flux<Invoice> findInvoice(@RequestParam("token") String token) {
        WebClientService.token = token;
        return webClientService.findInvoices();
    }

    @GetMapping("/token")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> getUserById(@RequestParam("token") String token) {
        WebClientService.token = token;
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
