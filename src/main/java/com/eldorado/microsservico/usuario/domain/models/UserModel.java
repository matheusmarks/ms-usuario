package com.eldorado.microsservico.usuario.domain.models;

import com.eldorado.microsservico.usuario.dtos.AdressDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("user")
public class UserModel {

    @NonNull
    @Id
    private String document;

    @NonNull
    private String email;

    @NonNull
    private String name;

    private String gender;

    @NonNull
    private LocalDate birthDate;

    private AdressEntity adressEntity;
}
