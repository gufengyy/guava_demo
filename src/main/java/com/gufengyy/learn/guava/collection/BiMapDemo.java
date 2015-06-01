package com.gufengyy.learn.guava.collection;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapDemo {
    public static void main(String[] args) {
        BiMap<String, String> cityMap = HashBiMap.create();
        cityMap.put("CS", "长沙");
        cityMap.put("BJ", "北京");
        cityMap.put("TJ", "天津");
        cityMap.put("ZZ", "郑州");
        
        System.out.println(cityMap.get("ZZ"));
        System.out.println(cityMap.inverse().get("北京"));
    }
}
