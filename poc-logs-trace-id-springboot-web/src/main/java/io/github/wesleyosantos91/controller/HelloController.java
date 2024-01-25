package io.github.wesleyosantos91.controller;

import io.github.wesleyosantos91.Application;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {

    private static final Log logger = LogFactory.getLog(Application.class);

    @GetMapping
    public String home() {
        logger.info("home() has been called");
        return "Hello World!";
    }

}
