package io;


import java.io.File;
import java.io.IOException;

public class FileMaker {


    public static void main(String[] args) {
        String filePath="D://";
        String fileName="newfile";
        File file=new File(filePath, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        createFile();
    }
    public static void createFile() {
        try {
            File file=new File("D://","newfile2");
            if (file.createNewFile()) { // 创建文件
                System.out.println("文件创建成功，路径为：" + file.getAbsolutePath());
            } else {
                System.out.println("文件已存在，路径为：" + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("创建文件时发生错误：");
            e.printStackTrace();
        }
    }
}

