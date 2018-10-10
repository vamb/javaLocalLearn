package com.test.main;

import com.test.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTestJava {
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


        System.out.println("");
        System.out.println("推荐，尤其是容量大时, 通过Map.entrySet遍历key和value");
        for(Map.Entry<String, String> entry: testMap.entrySet()){
            System.out.println("key= "+entry.getKey()+" value= "+entry.getValue());
        }

        System.out.println("");
        System.out.println("第四种， 通过Map.values()来遍历，但是不能遍历key");
        for( String v: testMap.values()){
            System.out.println("values= "+v);
        }

        System.out.println("");
        System.out.println( testMap.size());

        for (Map.Entry<String, String> entry: testMap.entrySet()) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println("============================================");
        Map<Student, String> map = new HashMap<Student, String>();
        for(int i =0;i<4;i ++){
            map.put(new Student("name"+i, i, "address"+i), "String"+i);
        }

        System.out.println("\n1");
        for(Map.Entry<Student, String> entry: map.entrySet()){
            System.out.println(entry.getKey().getName()+" "+entry.getKey().getAge()+" "+entry.getKey().getAddress()+" "
                    +entry.getValue());
        }
        System.out.println("\n2");
        for(String value: map.values()){
            System.out.println(value);
        }
        System.out.println("\n3");
        for(Student stuKey: map.keySet()){
            System.out.println(stuKey.getName()+" "+stuKey.getAge()+" "+stuKey.getAddress()+" "+map.get(stuKey));
        }
        System.out.println("\n4");
        Iterator<Map.Entry<Student, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<Student, String> entry = iterator2.next();
            System.out.println(entry.getKey().getName()+" "+entry.getKey().getAge()+" "+entry.getKey().getAddress()+" "
                    +entry.getValue());
        }

    }
}
