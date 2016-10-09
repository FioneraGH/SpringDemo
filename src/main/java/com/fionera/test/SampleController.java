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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fionera on 16-9-29.
 */
@Controller
@PropertySource("classpath:custom.properties")
public class SampleController {
    private final ApplicationContext applicationContext;

    private final FunctionService functionService;

    private final CustomBean customBean;

    @Value("${app.name}")
    String appName;

    @Autowired
    public SampleController(ApplicationContext applicationContext, FunctionService functionService,
                            CustomBean customBean) {
        this.applicationContext = applicationContext;
        this.functionService = functionService;
        this.customBean = customBean;
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
        applicationContext.publishEvent(new DemoEvent(this, customBean.getDate()));
        return functionService.sayHello(userName + " " + this.hashCode());
    }

    @RequestMapping(value = "/json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public TestPojo getJson(Long id, String name) {
        TestPojo testPojo = new TestPojo();
        testPojo.setId(id);
        testPojo.setName(name);
        testPojo.setApp(appName);
        return testPojo;
    }

    @SuppressWarnings("unused")
    private class TestPojo {
        private Long id;
        private String name;
        private String app;

        public Long getId() {
            return id;
        }

        void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        public String getApp() {
            return app;
        }

        void setApp(String app) {
            this.app = app;
        }
    }
}
