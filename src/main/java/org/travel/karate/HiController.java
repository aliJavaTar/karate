package org.travel.karate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class HiController {

    @GetMapping("/hi")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello, Traveler! Welcome to the Karate World!";
    }

}
