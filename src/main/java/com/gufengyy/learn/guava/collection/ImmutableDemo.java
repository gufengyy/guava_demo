package com.gufengyy.learn.guava.collection;

import java.util.Collections;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
/**
 * 
 * @author gufengyy
 * @see http://outofmemory.cn/java/guava/Collections/Immutable
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        Set<String> origin = Sets.newHashSet();
        origin.add("a");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(origin);
        Set<String> immutableNamedColors = ImmutableSet.<String> builder().addAll(origin).build();
        origin.add("b");
        // JDK实现的不可变集合，并不是真正的不可变。如当原始集合发生变化时。
        unmodifiableSet.forEach(System.out::println);
        // guava中是真正的不可变集合
        immutableNamedColors.forEach(System.out::println);

    }
}
