package com.test.main.File;

import com.test.utils.Constant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest2Java {
    public static void main(String[] args) throws IOException {
        System.out.println("File Test Java 2");

        File dir = new File(Constant.WIN_FILE_PATH);
        System.out.println("isFile: "+dir.isFile()+" isDir: "+dir.isDirectory());
        File unknown = new File(File.separator, "testUnknown.txt");
        unknown.createNewFile();

        File dirPath = new File(Constant.WIN_FILE_PATH);
        System.out.println("\n");
        for(File file: dirPath.listFiles()){
            System.out.println(file.getName());
        }

        System.out.println("\n=================");
        try{
            BufferedReader in = new BufferedReader((new FileReader(new File(Constant.WIN_FILE_PATH, "Test3.txt"))));
            String str;
            while((str = in.readLine()) != null){
                System.out.println("1 "+str);
            }
        }catch (IOException ex){
            System.out.println("read file exception: "+ex.getMessage());
        }


    }
}
