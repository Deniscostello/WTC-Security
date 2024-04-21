package ie.atu.wtcsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WtcSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtcSecurityApplication.class, args);
    }

}
