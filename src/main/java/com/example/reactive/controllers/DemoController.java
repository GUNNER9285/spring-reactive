package com.example.reactive.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class DemoController {

    @GetMapping({"", "/mono"})
    public Mono<String> hello() {
        log.debug("call mono method");
        return Mono.just("Hello world.");
    }

    @GetMapping({"", "/flux"})
    public Flux<String> get() {
        log.debug("call flux method");
        return Flux.just("Hello world.", "Hello school");
    }
}
