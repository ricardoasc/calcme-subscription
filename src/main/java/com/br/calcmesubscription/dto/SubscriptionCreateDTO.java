package com.br.calcmesubscription.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionCreateDTO {
    @NotBlank(message = "Nome deve ser informado")
    @Size(min = 3, max = 30, message = "Nome inválido, deve ser informado no mínimo 3 até 30 caracteres")
    private String name;
    @Email(message = "Email inválido")
    @NotBlank(message = "Email deve ser informado")
    private String email;
    @NotBlank(message = "Telefone deve ser informado")
    @Pattern(regexp = "^\\d{11}$", message = "Número de telefone inválido")
    private String phone;
}
