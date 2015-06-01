package com.gufengyy.learn.guava.collection;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

public class IteratorsDemo {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("Apple","Pear","Peach");
        Predicate<String> condition = new Predicate<String>() {
            
            @Override
            public boolean apply(String input) {
                return input.startsWith("P");
            }
        };
        
        System.out.println(Iterators.all(list.iterator(), condition));
        System.out.println(Iterators.any(list.iterator(), condition));
    }
}
