package com.groupeisi.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms2/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> sayHello() {
        HelloResponse response = new HelloResponse("Hello, je suis MS2");
        return ResponseEntity.ok(response);
    }
}
