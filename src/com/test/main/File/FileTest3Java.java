package com.test.main.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest3Java {
    public static void main(String[] args){
        System.out.println("File Test3 java start");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("System.in inputStream: " + br.readLine());
        }catch (IOException ex){
            System.out.println("Exception "+ ex.getMessage());
        }
    }
}
