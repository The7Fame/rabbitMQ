package eu.senla.naumovich.conf;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @JmsListener(destination = "msg")
    public void getMsg(String msg){
        System.out.println("Msg received");
        System.out.println("Msg = " + msg);
    }
}
