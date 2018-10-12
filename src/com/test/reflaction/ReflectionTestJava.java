package com.test.reflaction;

import com.test.bean.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTestJava {
    public static void main(String[] args) throws Exception {
        System.out.println("reflection java test");

        Class<?> c = String.class;
        Constructor constructor = c.getConstructor(String.class);
        Object obj = constructor.newInstance("testMSG");
        System.out.println(obj+"\n");

        Class<?> s = Student.class;
        Constructor sConstructor = s.getConstructor(String.class);
        Object sObj = sConstructor.newInstance("TestName");
        Method method = s.getMethod("getName");
        System.out.println("1: "+sObj);
        System.out.println("2: "+method+"\n");

        Class<?> klass = methodClass.class;
        Object kObj = klass.newInstance();
        Method addMethod = klass.getMethod("add", int.class, int.class);
        Method subMethod = klass.getMethod("sub", int.class, int.class);
        Object subResult = subMethod.invoke(kObj, 4,2);
        Object result = addMethod.invoke(kObj, 1,3);
        System.out.println("addResult: "+result+" subResult: "+subResult);
    }
}
class methodClass{
    public final int fuck = 3;
    public int add (int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}