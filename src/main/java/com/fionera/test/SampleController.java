package com.fionera.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fionera on 16-9-29.
 */
@RestController
public class SampleController {
    @Autowired
    FunctionService functionService;

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String home(@PathVariable String userName) {
        applicationContext.publishEvent(new DemoEvent(this, "哈哈哈哈"));
        return functionService.sayHello(userName + " " + this.hashCode());
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json;" +
            "charset=UTF-8")
    public TestPojo getJson(Long id, String name) {
        TestPojo testPojo = new TestPojo();
        testPojo.setId(1000L);
        testPojo.setName("hhahahah");
        return testPojo;
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.DELETE)
    public String removeUser(@PathVariable String userName) {
        return userName + " removed";
    }

    private class TestPojo {
        private Long id;
        private String name;

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
    }
}
