package com.fionera.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fionera on 16-9-29.
 */
@Controller
@PropertySource("classpath:custom.properties")
public class SampleController {
    @Autowired
    FunctionService functionService;

    @Autowired
    ApplicationContext applicationContext;

    @Value("${app.name}")
    String appName;

    @Autowired
    CustomBean customBean;

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

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String userName(@PathVariable String userName) {
        applicationContext.publishEvent(new DemoEvent(this, customBean.getDate()));
        return functionService.sayHello(userName + " " + this.hashCode());
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json;" +
            "charset=UTF-8")
    public TestPojo getJson(Long id, String name) {
        TestPojo testPojo = new TestPojo();
        testPojo.setId(id);
        testPojo.setName(name);
        testPojo.setApp(appName);
        return testPojo;
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.DELETE)
    public String removeUser(@PathVariable String userName) {
        return userName + " removed";
    }

    private class TestPojo {
        private Long id;
        private String name;
        private String app;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }
    }
}
