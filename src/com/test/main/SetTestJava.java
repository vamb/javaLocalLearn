package com.test.main;

import com.test.bean.Student;

import java.util.HashSet;
import java.util.Set;

public class SetTestJava {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        for(int i=0;i<10;i++){
            set.add(i+"");
        }
        System.out.println(set+"\n");

        Set<Student> stdSet = new HashSet<Student>();
        stdSet.add(new Student("name1", 2));
        stdSet.add(new Student("name2", 2));
        stdSet.add(new Student("name3", 3));
        stdSet.add(new Student("name4", 4));
        stdSet.add(new Student("name1", 2));

        System.out.println(stdSet.toString()+"\n");
    }
}
