package com.test.main.File;

import com.test.utils.Constant;

import java.io.*;

public class FileTest4Java {
    public static void main(String[] args) throws Exception{
        System.out.println("File I/O, Writer/Reader, BufferedWriter/BufferReader start ");

        fileInputStream(Constant.WIN_FILE_PATH, "Test3.txt");
    }
    public static void fileOutputStream(String path, String fileName) throws Exception{
        File tempFile = new File(path, fileName);
        if(tempFile.exists() == false){
            System.out.println("File not exists"); tempFile.createNewFile();
        }else{
            System.out.println("File exists");
        }
        FileOutputStream fos = new FileOutputStream(tempFile);
        String str = "今天的天气很阴沉";
        byte[] b = str.getBytes();
        fos.write(b);
        fos.close();
    }
    public static void fileInputStream(String path, String fileName) throws Exception{
        File file = new File(path, fileName);
        if(file.exists() == false){
            System.out.println("current file not exist");
            return;
        }
        FileInputStream fi = new FileInputStream(file);
        byte[] b = new byte[(int) file.length()];
        fi.read(b);

        String str= new String(b);
        fi.close();
        System.out.println(str);
    }
}
