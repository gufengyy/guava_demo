package com.gufengyy.learn.guava.base;

import com.google.common.base.Optional;

public class OptionalDemo {
    public static class Student {

    }

    public static void main(String[] args) {
        Optional<Student> possibleNull = Optional.of(null);
        possibleNull.get();
    }
}
