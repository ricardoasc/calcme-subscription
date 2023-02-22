package com.br.calcmesubscription.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "subscriptions")
public class Subscription {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
}
