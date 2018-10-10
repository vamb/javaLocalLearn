package com.test.main;

import java.util.HashSet;
import java.util.Set;

public class SetTestJava {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        for(int i=0;i<10;i++){
            set.add(i+"");
        }
        set.add("4");
        set.add("aa");
        System.out.println(set);
    }
}
