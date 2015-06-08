package com.gufengyy.learn.guava.collection;

import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;

/**
 * 
 * @author gufengyy
 * @see http://ifeve.com/google-guava-collectionutilities/
 */
public class MapsDemo {

    private static class Stu {
        int id;
        String name;

        public Stu(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Stu [id=" + id + ", name=" + name + "]";
        }

    }

    public static void main(String[] args) {
        List<Stu> list = Lists.newArrayList(new Stu(1, "zhangsan"), new Stu(2,
                "lei"), new Stu(3, "good"));
        // 通过 Maps.uniqueIndex 可以根据对象某一特殊(唯一)的属性来查找对象
        ImmutableMap<Integer, Stu> immutableMap = Maps.uniqueIndex(list,
                new Function<Stu, Integer>() {

                    @Override
                    public Integer apply(Stu stu) {
                        return stu.id;
                    }
                });

        System.out.println(immutableMap.get(1));

        // Maps.difference(Map, Map)用来比较两个Map以获取所有不同点。该方法返回MapDifference对象
        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("d", 5, "b", 2, "c", 7);
        MapDifference<String, Integer> diff = Maps.difference(left, right);

        System.out.println(diff.entriesInCommon()); // {"b" => 2}
        System.out.println(diff.entriesOnlyOnLeft()); // {"a" => 1}
        System.out.println(diff.entriesOnlyOnRight()); // {"d" => 5}
        
        
        ImmutableSet<String> digits = ImmutableSet.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        Function<String, Integer> lengthFunction = new Function<String, Integer>() {
            public Integer apply(String string) {
                return string.length();
            }
        };

        ImmutableListMultimap<Integer, String> digitsByLength= Multimaps.index(digits, lengthFunction);
        System.out.println(digitsByLength);
        /*
        *  digitsByLength maps:
        *  3 => {"one", "two", "six"}
        *  4 => {"zero", "four", "five", "nine"}
        *  5 => {"three", "seven", "eight"}
        */
    }
}
