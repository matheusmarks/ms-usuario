package com.eldorado.microsservico.usuario.services;

import com.eldorado.microsservico.usuario.dtos.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;



@Service
@Slf4j
public class UserService {

    public UserDto createUser(@Validated UserDto userDto) {
        return null;
    }

    private String passwordGenerator() {
        return Base64.encodeBase64String(RandomStringUtils
                .randomAlphabetic(10).getBytes());
    }
}
