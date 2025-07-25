package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String path="d://newfile";
        BufferedReader buf=new BufferedReader(new FileReader(path));
        String line = buf.readLine();
        System.out.println(line);
        buf.close();
    }
}
