package com.noel.rest.webservices.restfulwebservices.helloworld.helloworld;

// import org.springframework.web.bind.annotation.PathVariable;

public class HelloWorldBean {
    String name;

    public HelloWorldBean() {

    }

    public HelloWorldBean( String name) {
    this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" + "name='" + name + '\'' + '}';
    }
}
