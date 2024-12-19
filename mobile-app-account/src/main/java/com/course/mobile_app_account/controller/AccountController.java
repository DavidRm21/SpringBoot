package com.course.mobile_app_account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {

    @GetMapping
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok("Funcionando..");
    }
}
