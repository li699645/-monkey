package org.example.practice1.pojo;

import java.io.File;
import java.io.IOException;

public class Test{
    public static void main(String[] args) {
        String filePath="d:/new.txt";
        File file=new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
