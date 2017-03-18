package com.fionera.test.controller;

import com.fionera.test.model.Person;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SearchController
 * Created by fionera on 16-10-9.
 */
@RestController
public class SearchController {

    @RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName) {
        return new Person(personName, 22, "hefei");
    }
}
