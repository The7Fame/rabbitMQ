package eu.senla.naumovich.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitProps {
    private String password;
    private String username;
    private String host;
}
