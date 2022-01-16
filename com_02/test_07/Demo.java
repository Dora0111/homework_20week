package com_2week.com_02.test_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys,0,len));
        }
    }
}
