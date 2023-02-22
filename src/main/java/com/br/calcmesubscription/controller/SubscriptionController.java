package com.br.calcmesubscription.controller;

import com.br.calcmesubscription.dto.SubscriptionCreateDTO;
import com.br.calcmesubscription.dto.SubscriptionDTO;
import com.br.calcmesubscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping
    public ResponseEntity<SubscriptionDTO> createSubscription(@Valid @RequestBody SubscriptionCreateDTO insertSubscriptionDTO) {
        SubscriptionDTO createdSubscription = subscriptionService.createSubscription(insertSubscriptionDTO);
        return new ResponseEntity<>(createdSubscription, HttpStatus.CREATED);
    }

}
