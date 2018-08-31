package com.noel.rest.webservices.restfulwebservices.helloworld.versioning;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {


    @GetMapping(value="v1/person")
    public Person1 person1(){
        return new Person1("Bob Charlie");
    }


    @GetMapping(value="v2/person")
    public Person2 person2(){
        return new Person2(new Name("Bob","Charlie"));
    }


    @GetMapping(value="/person/param" , params= "version=1")
    public Person1 paramV1(){
        return new Person1("Bob Charlie");
    }


    @GetMapping(value="/person/param" , params= "version=2")
    public Person2 paramV2(){
        return new Person2(new Name("Bob","Charlie"));
    }


    @GetMapping(value="/person/header" , headers= "X-API-VERSION=1")
    public Person1 headerV1(){
        return new Person1("Bob Charlie");
    }


    @GetMapping(value="/person/header" , headers= "X-API-VERSION=2")
    public Person2 headerV2(){
        return new Person2(new Name("Bob","Charlie"));
    }

    @GetMapping(value="/person/produces" , produces= "application/vnd.company.app-v1+json")
    public Person1 producesV1(){
        return new Person1("Bob Charlie");
    }


    @GetMapping(value="/person/produces" , produces = "application/vnd.company.app-v2+json")
    public Person2 producesV2(){
        return new Person2(new Name("Bob","Charlie"));
    }


}
