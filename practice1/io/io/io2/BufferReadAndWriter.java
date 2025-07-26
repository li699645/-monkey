package io.io2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReadAndWriter {
    public static void main(String[] args) {
        String path = "mystory.txt";
        BufferedWriter bw;

        {
            try {
                bw = new BufferedWriter(new FileWriter(path));
                bw.write("hello");
                bw.newLine();
                bw.write("world");
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
