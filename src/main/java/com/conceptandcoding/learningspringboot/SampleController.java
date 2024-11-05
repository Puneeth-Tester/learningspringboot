package com.conceptandcoding.learningspringboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/")
public class SampleController {

    @GetMapping(path="/fetchUser")
    public String getUserDetails(@RequestParam(value = "firstName") String firstName,
                                 @RequestParam(name = "lastName", required = false) String lastName) {
        String output = "fetched user details of " + firstName + " and lastName : " + lastName;
        return output;
    }
}
