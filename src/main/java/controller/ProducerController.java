package controller;

import model.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProducerService;

import java.util.Set;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

@RestController
@RequestMapping("/api/producer")
public class ProducerController {

    private ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }
    @PostMapping
    public void create(@RequestParam String firstName,
                       @RequestParam String lastName,
                       @RequestParam Long addressId) {

        producerService.create(Name, addressId);
    }
    @GetMapping
    public Set<Producer> findAll() {
        return producerService.findAll();
    }
}
