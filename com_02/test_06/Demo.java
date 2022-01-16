package com_2week.com_02.test_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("创立窗外.txt");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
