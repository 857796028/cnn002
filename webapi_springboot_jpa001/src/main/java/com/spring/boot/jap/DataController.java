package com.spring.boot.jap;

import javafx.geometry.Pos;
import org.omg.CORBA.RepositoryIdHelper;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.management.Agent;

import java.util.List;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 2:26
 */

@RestController
public class DataController
{
@Autowired
PersonRepository personRepository;


@RequestMapping("/save")
    public Person save(String name,String address,Integer age){
    Person person = personRepository.save(new Person(null, name, age, address));
    return person;



  }

    @RequestMapping("/q1")
    public List<Person> q1(String address){
        List<Person> people = personRepository.findByAddress(address);
        return  people;
    }
    @RequestMapping("/q2")
    public  Person q2(String name,String address){
        Person person = personRepository.findByNameAndAddress(name, address);
        return person;
    }

    @RequestMapping("/q3")
    public Person q3(String name,String address){
        Person person = personRepository.withNameAndAddressQuery(name, address);
        return  person;

    }
    @RequestMapping("/q4")
    public  Person q4(String name,String address){
        Person person = personRepository.withNameAndAddressNamedQuery(name, address);
        return person;

    }

    @RequestMapping("/sort")
    public List<Person> sort(){
        List<Person> people = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        return people;
    }
    @RequestMapping("/page")
    public Page<Person> page(int page,int size){
        Page<Person> all = personRepository.findAll(new PageRequest(page, size));
        return all;
    }

}
