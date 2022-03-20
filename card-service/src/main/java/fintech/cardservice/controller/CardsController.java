package fintech.cardservice.controller;

import fintech.cardservice.model.Cards;
import fintech.cardservice.model.Customer;
import fintech.cardservice.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static fintech.cardservice.controller.CardsController.BASE_URL;

@RestController
public class CardsController {
    public static final String BASE_URL = "customer";

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/card-details")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        return cardsRepository.findByCustomerId(customer.getCustomerId());
    }
    @GetMapping("/cards")
    public List<Cards> getAllCards() {
        return cardsRepository.findAll();
    }

}