package eu.senla.naumovich.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private JmsTemplate template;

    public void send(String msg){
        System.out.println("Msg is sent");
        template.convertAndSend("msg", msg);
    }
}
