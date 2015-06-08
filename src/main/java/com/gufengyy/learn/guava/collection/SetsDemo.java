package com.gufengyy.learn.guava.collection;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class SetsDemo {
    public static void main(String[] args) {
        // union
        Set<String> set1 = Sets.newHashSet("a","b","c");
        Set<String> set2 = Sets.newHashSet("d","a");
        SetView<String> unionSet = Sets.union(set1, set2);
        unionSet.forEach(System.out::println);
        
        System.out.println("-----interSection---");
        // 交集
        SetView<String> interSection = Sets.intersection(set1, set2);
        interSection.forEach(System.out::println);

        System.out.println("-----diff---");
        // difference
        SetView<String> diff = Sets.difference(set1, set2);
        diff.forEach(System.out::println);
    }
}
