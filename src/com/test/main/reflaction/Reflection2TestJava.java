package com.test.main.reflaction;

import com.test.bean.Student;

import java.lang.reflect.Method;

public class Reflection2TestJava {
    public static void main(String[] args)throws Exception{
        System.out.println("reflection2 test");

        Class<?> sClass = Student.class;
        Object sObj = sClass.newInstance();

        Method setName = sClass.getMethod("setName", String.class);
        Method setAge = sClass.getMethod("setAge", Integer.class);
        Method setAddress = sClass.getMethod("setAddress", String.class);

        Method toString = sClass.getMethod("toString");

        setName.invoke(sObj,"TestName");
        setAge.invoke(sObj, 3);
        setAddress.invoke(sObj, "testAddress");
        System.out.println(toString.invoke(sObj));
    }
}
