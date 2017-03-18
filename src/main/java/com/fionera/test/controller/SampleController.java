package com.fionera.test.controller;

import com.fionera.test.event.DemoEvent;
import com.fionera.test.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * SampleController
 * Created by fionera on 16-9-29.
 */
@Controller
public class SampleController {
    private final ApplicationContext applicationContext;

    @Autowired
    public SampleController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        Person single = new Person("I am Single", 111);

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("one", 2);
        Person p2 = new Person("two", 3);
        Person p3 = new Person("three", 4);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getUserName(@PathVariable String userName) {
        applicationContext.publishEvent(new DemoEvent(this, new Date().toString()));
        return userName + " " + this.hashCode();
    }
}
