package com.snnlab.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallback")
public class FallbackRestController {

    @GetMapping("/message")
    public Mono<String> fallBackMessage() {
        return Mono.just("No response from service and will be back shortly");
    }
}