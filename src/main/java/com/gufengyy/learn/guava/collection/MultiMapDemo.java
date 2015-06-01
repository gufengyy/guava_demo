package com.gufengyy.learn.guava.collection;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultiMapDemo {
    public static void main(String[] args) {
        Multimap<String, String> multiMap = ArrayListMultimap.create();
        multiMap.put("class1", "chinese");
        multiMap.put("class1", "math");
        multiMap.put("class1", "english");
        multiMap.put("class2", "english");
        multiMap.put("class2", "law");
        
        System.out.println(multiMap.size());
        multiMap.get("class1").forEach(System.out::println);
        multiMap.get("class2").forEach(System.out::println);
    }
}
