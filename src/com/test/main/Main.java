package com.test.main;

import com.test.bean.Student;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        HashMap<Student, String> hm = new HashMap<Student, String>();
        hm.put(new Student("name1" ,21), "山东1");
        hm.put(new Student("name2", 22), "山东2");
        hm.put(new Student("name3", 23), "山东3");
        hm.put(new Student("name4", 24), "山东4");
        hm.put(new Student("name5", 25), "山东5");

        Set<Map.Entry<Student,String>> set = hm.entrySet();

    }
}
