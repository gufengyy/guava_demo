package com.gufengyy.learn.guava.base;

import com.google.common.base.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Object a = null;
        Object b = new Object();
        System.out.println(Objects.equal(b, a));
    }
}
