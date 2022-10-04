package dev.dmohindru.servicea.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppProperties {


    @Value("${custom.servicea.message}")
    String message;

    @Value("${custom.servicea.encrpytedMessage}")
    String encryptedMessage;

    @Value("${custom.name}")
    String name;
}
