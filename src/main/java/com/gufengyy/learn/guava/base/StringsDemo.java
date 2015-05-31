package com.gufengyy.learn.guava.base;

import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

/**
 * 
 * @author gufengyy
 * 
 * @see http://outofmemory.cn/java/guava/base/Strings
 */
public class StringsDemo {
    public static void main(String[] args) {
        System.out.println("Null:" + Strings.isNullOrEmpty(null));
        System.out.println("''" + Strings.isNullOrEmpty(""));

        // 获得两个字符串相同的前缀或者后缀
        String a = "com.gufengyy.dao";
        String b = "com.gufengyy.dao.impl";
        String c = "com.gufengyy.service.impl";
        System.out.println(Strings.commonPrefix(a, b));
        System.out.println(Strings.commonPrefix(a, c));
        System.out.println(Strings.commonSuffix(b, c));

        // Strings的padStart和padEnd方法来补全字符串
        int minLength = 4;
        String padEndResult = Strings.padEnd("123", minLength, '0');
        System.out.println("padEndResult is " + padEndResult);

        String padStartResult = Strings.padStart("1", 2, '0');
        System.out.println("padStartResult is " + padStartResult);

        // 使用Splitter类来拆分字符串
        String toSplitString = "a=b;c=d,e=f";
        Map<String, String> kvs = Splitter.onPattern("[,;]{1,}")
                .withKeyValueSeparator('=').split(toSplitString);
        for (Map.Entry<String, String> entry : kvs.entrySet()) {
            System.out.println(String.format("%s=%s", entry.getKey(),
                    entry.getValue()));
        }

        // 合并字符串
        String result = Joiner.on(",").join(new String[] { "a", "b", "c" });
        System.out.println(result);
        // 二次合并
        Map<String, String> map = Maps.newHashMap();
        map.put("a", "b");
        map.put("c", "d");
        System.out.println(Joiner.on(",").withKeyValueSeparator("=").join(map));

    }
}
