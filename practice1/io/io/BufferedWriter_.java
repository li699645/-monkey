package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String path="d://newfile";
        BufferedWriter bw=new BufferedWriter(new FileWriter(path));
        bw.write("hello");
        bw.close();

        File file=new File("d://mystory.txt");
        file.createNewFile();
    }

}
