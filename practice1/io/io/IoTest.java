package io;

import java.io.*;

public class IoTest{
public static void main(String[] args) throws IOException {
    File file =new File("d://","newfile3.txt");
    try {
        file.createNewFile();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    FileOutputStream fos = null;
    try {
        fos = new FileOutputStream(file);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    FileInputStream fis = null;
    fis = new FileInputStream(file);
    String str="fenghuiluzhuan";
    try {
        fos.write(str.getBytes());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }finally {
        fos.close();
    }
    int a;
while((a=fis.read())!=-1){
    System.out.print((char)a);
}
fis.close();
}
}