package io;

import java.io.*;

public class IoTest2 {
    public static void main(String[] args) throws Exception {
        File file=new File("d://","name.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fos=new FileOutputStream(file);
        fis=new FileInputStream(file);
        String str = "smith";
        fos.write(str.getBytes());
        fos.close();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) { // 读取文件内容
            String content = new String(buffer, 0, bytesRead); // 将字节转换为字符串
            System.out.println("文件内容：");
            System.out.println(content);
        }
        fis.close();
    }

}
