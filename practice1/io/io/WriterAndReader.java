package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterAndReader {
    public static void main(String[] args) throws IOException {
        String path="mystory.txt";
        FileWriter fw = new FileWriter(path, true);
        fw.write("第一条消息\n");
        fw.close();
        FileReader fr = new FileReader(path);
        char[] buffer= new char[1024];
        int bytesRead;
      while((bytesRead=fr.read(buffer))!=-1)
        {System.out.println(new String(buffer, 0, bytesRead));
        }
        fr.close();
    }
}
