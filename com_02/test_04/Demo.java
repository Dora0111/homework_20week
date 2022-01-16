package com_2week.com_02.test_04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    //如何换行 如何追加写入
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        //写入
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
