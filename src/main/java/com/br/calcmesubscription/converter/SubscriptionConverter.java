package com.br.calcmesubscription.converter;

import com.br.calcmesubscription.dto.SubscriptionCreateDTO;
import com.br.calcmesubscription.dto.SubscriptionDTO;
import com.br.calcmesubscription.model.Subscription;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionConverter {

    public SubscriptionDTO convertToDTO(Subscription source) {
        return SubscriptionDTO.builder()
                .id(source.getId())
                .name(source.getName())
                .email(source.getEmail())
                .phone(source.getPhone())
                .build();
    }

    public Subscription convertToEntity(SubscriptionCreateDTO source) {
        return Subscription.builder()
                .name(source.getName())
                .email(source.getEmail())
                .phone(source.getPhone())
                .build();
    }
}
