package de.roskenet.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

    @Value("${some.property}")
    private String someProperty;

    public void doSomething() {
        System.out.println("Value of some.property: " + someProperty);
    }
}
