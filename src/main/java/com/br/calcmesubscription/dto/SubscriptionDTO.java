package com.br.calcmesubscription.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
}
