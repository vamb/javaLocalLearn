package com.test.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestJava {
    public static void main(String[] args){
        System.out.println("Test one start");

        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("1", "test1");
        testMap.put("2", "test2");
        testMap.put("3", "test3");
        testMap.put("4", "test4");

        System.out.println("普通遍历 二次取值 通过Map.keySet遍历key和value: ");
        for(String key: testMap.keySet()){
            System.out.println("key= "+key+" and value= "+ testMap.get(key));
        }

        System.out.println("");
        System.out.println("通过Map.entrySet使用iterator遍历key和value： ");
        Iterator<Map.Entry<String, String>> iterator = testMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key= "+entry.getKey()+" and value= "+ entry.getValue());
        }
    }
}
