package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.producer.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class SampleController {

    private final Producer producer;

    @GetMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("top");
        return modelAndView;
    }

    @PostMapping("/kafkaTest")
    ModelAndView kafkaTest(@RequestBody String message) {
        ModelAndView modelAndView = new ModelAndView("complete");
        producer.sendMessage(message);
        return modelAndView;
    }
}
