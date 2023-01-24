package com.eldorado.microsservico.usuario.dtos;

import lombok.*;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    @NonNull
    private String email;

    @NonNull
    private String name;

    private String gender;

    @NonNull
    private LocalDate birthDate;

    @NonNull
    private String document;

    private AdressDto adress;
}
