package io.github.wesleyosantos91.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @GetMapping
    public Mono<String> home() {
        logger.info("home() has been called");
        return Mono.just("Hello World!");
    }

}
