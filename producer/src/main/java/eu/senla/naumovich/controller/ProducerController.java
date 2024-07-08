package eu.senla.naumovich.controller;

import eu.senla.naumovich.conf.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private Producer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam(name = "msg") String msg){
        producer.send(msg);
        return "Msg sent";
    }
}
