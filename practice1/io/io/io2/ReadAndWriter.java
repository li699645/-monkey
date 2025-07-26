package io.io2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriter {
    public static void main(String[] args) throws IOException {
        File file =new File("d://learn.txt");
        file.createNewFile();
        FileWriter  a=new FileWriter("d://learn.txt");
        a.write("practice");
        a.close();
        FileReader fr = new FileReader("d://learn.txt");
        char[] buffer= new char[1024];
        int bytesRead;
        while((bytesRead=fr.read(buffer))!=-1)
        {System.out.println("\n"+new String(buffer, 0, bytesRead));
        }
        fr.close();
        }
    }