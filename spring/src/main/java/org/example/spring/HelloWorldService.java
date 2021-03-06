package org.example.spring;

import org.example.spring.Greeter;

class HelloWorldService implements Greeter {
    String greeting;

    public HelloWorldService(String greeting) {
        this.greeting = greeting;
    }

    public HelloWorldService() {
        this.greeting = "Hello";
    }

    public String getGreeting(String name) {
        return this.greeting + ", " + name + "!";
    }

}
