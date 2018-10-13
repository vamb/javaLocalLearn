package com.test.main.File;

import com.test.utils.Constant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileTest4Java {
    public static void main(String[] args) throws Exception{
        System.out.println("File I/O, Writer/Reader, BufferedWriter/BufferReader start ");
        File file1= new File(Constant.WIN_FILE_PATH, "Test3.txt");

        BufferedReader br = new BufferedReader(new FileReader(file1));
        System.out.println("file contain: "+br.readLine());
    }
}
