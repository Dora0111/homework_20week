package com_2week.com_02.test_09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

//一个汉字GBK编码，占两个字节
//UTF-8编码，占用三个字节

public class Demo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("fos.txt");
//
//        int by;
//        while ((by = fis.read()) != -1) {
//            System.out.print((char) by);
//        }
//        fis.close();

        String s = "中国";
        byte[] bys = s.getBytes("GBK");
//        byte[] bys = s.getBytes("UTF-8");
        //字符流=字节流+编码表
        System.out.println(Arrays.toString(bys));
    }
}
