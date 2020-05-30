package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IAmATeapot {

    private final String name;

    public IAmATeapot(@Value("asdf.assss") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
