package com.test.main.File;

import com.test.utils.Constant;

import java.io.File;

public class FileTestJava {
    final static String FILE_PATH = "D:"+ Constant.SEPARATOR+"workspace"+Constant.SEPARATOR+"javaLocalLearn"+Constant.SEPARATOR+
            "src"+Constant.SEPARATOR+"resource"+Constant.SEPARATOR+"file";
    public static void main(String[] args){
        File f1 = new File("D:\\workspace\\javaLocalLearn\\src\\resource\\file\\Test.txt");
        File f2 = new File("D:\\workspace\\javaLocalLearn\\src\\resource\\file", "Test2.txt");
        File f3 = new File(FILE_PATH, "Test3.txt");

        System.out.println(f1.getName()+" "+f1.exists());

        System.out.println(f2.getName()+" "+f2.exists());

        System.out.println(f3.getName()+" "+f3.exists());

        File f4 = new File(FILE_PATH);
        System.out.println("isFile: "+ f4.isFile()+" isDirectory: "+f4.isDirectory());
    }
}
