package com.fionera.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fionera on 16-10-10.
 */
@RestController
public class JpaController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/jpa/save")
    public Person save(String name,String address,Integer age){
        Person p = personRepository.save(new Person(null,name,age,address));
        return p;
    }

    @RequestMapping("/jpa/find1")
    public List<Person> find1(String address){
        List<Person> p = personRepository.findByAddress(address);
        return p;
    }

    @RequestMapping("/jpa/find2")
    public List<Person> find2(String name,String address){
        List<Person> p = personRepository.findByNameAndAddress(name,address);
        return p;
    }

    @RequestMapping("/jpa/find3")
    public Person find3(String name,String address){
        Person p = personRepository.withNameAndAddressQuery(name,address);
        return p;
    }

    @RequestMapping("/jpa/find4")
    public List<Person> find4(String name,String address){
        List<Person> p = personRepository.withNameAndAddressNameQuery(name,address);
        return p;
    }

    @RequestMapping("/jpa/sort")
    public List<Person> sort(){
        List<Person> p = personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
        return p;
    }

    @RequestMapping("/jpa/page")
    public Page<Person> page(){
        Page<Person> p = personRepository.findAll(new PageRequest(1,2));
        return p;
    }

    @RequestMapping("/jpa/auto")
    public Page<Person> auto(Person person){
        Page<Person> p = personRepository.findByAuto(person,new PageRequest(0,10));
        return p;
    }
}
