package com.epam.cdp.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergii Stets
 *         Date 16.07.2017
 */
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "hello from user service";
    }
}
