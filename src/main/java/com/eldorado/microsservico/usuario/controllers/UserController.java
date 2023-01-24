package com.eldorado.microsservico.usuario.controllers;

import com.eldorado.microsservico.usuario.dtos.UserDto;
import com.eldorado.microsservico.usuario.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok("OK");
    }
}
