package com.test.reflaction;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionTest3Java {
    public static void main(String[] args) throws Exception{
        System.out.println("ReflectionTest3Java start");
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls, 25);
        Array.set(array,0,"hello");
        Array.set(array,1,"Java");
        Array.set(array,2,"fuck");
        Array.set(array,3,"Scala");
        Array.set(array,4,"Clojure");

        System.out.println("test system class newInstance test: "+ Array.get(array, 3)+"\n");

        List<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("Java");
        arr.add("fuck");
        arr.add("Scala");
        arr.add("Clojure");

        System.out.println("comparision array: "+arr.get(3)+"\n");

        Method[] methods = cls.getMethods();
        for(Method method: methods){
            System.out.println("method: "+method.getName());
        }
    }
}
