package eu.senla.naumovich.conf;

import com.rabbitmq.jms.admin.RMQConnectionFactory;
import jakarta.jms.ConnectionFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableConfigurationProperties(RabbitProps.class)
@RequiredArgsConstructor
public class RabbitConf {
    private final RabbitProps rabbitProps;

    @Bean
    public ConnectionFactory connectionFactory(){
        RMQConnectionFactory connectionFactory = new RMQConnectionFactory();
        connectionFactory.setUsername(rabbitProps.getUsername());
        connectionFactory.setPassword(rabbitProps.getPassword());
        connectionFactory.setHost(rabbitProps.getHost());
        connectionFactory.setPort(5672);
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        return new JmsTemplate(connectionFactory());
    }
}
