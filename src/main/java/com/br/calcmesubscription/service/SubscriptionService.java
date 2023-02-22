package com.br.calcmesubscription.service;

import com.br.calcmesubscription.converter.SubscriptionConverter;
import com.br.calcmesubscription.dto.SubscriptionCreateDTO;
import com.br.calcmesubscription.dto.SubscriptionDTO;
import com.br.calcmesubscription.model.Subscription;
import com.br.calcmesubscription.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private SubscriptionConverter subscriptionConverter;

    public SubscriptionDTO createSubscription(SubscriptionCreateDTO dto) {
        Subscription subscription = subscriptionConverter.convertToEntity(dto);
        return subscriptionConverter.convertToDTO(subscriptionRepository.save(subscription));
    }
}
