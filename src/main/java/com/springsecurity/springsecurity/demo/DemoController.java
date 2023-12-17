package com.springsecurity.springsecurity.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/democontroller")
public class DemoController {
    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> sayhello(){
        return ResponseEntity.ok("Hello from USER INTERFACE");
    }
}
