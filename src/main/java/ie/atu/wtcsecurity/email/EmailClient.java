package ie.atu.wtcsecurity.email;

import ie.atu.wtcsecurity.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="email-service", url = "http://localhost:8086")
public interface EmailClient {
    @PostMapping("/email")
    String emailDetails(@RequestBody User user);
}
