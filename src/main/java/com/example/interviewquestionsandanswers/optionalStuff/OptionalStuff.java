package com.example.interviewquestionsandanswers.optionalStuff;

import java.util.Optional;

public class OptionalStuff {

    public Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
