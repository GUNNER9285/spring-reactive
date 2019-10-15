package com.example.reactive.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class DemoController {

    @GetMapping({"", "/"})
    public Mono<String> hello() {
        log.debug("call hello method");
        return Mono.just("Hello world.");
    }
}
