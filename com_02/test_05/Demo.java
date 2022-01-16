package com_2week.com_02.test_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        //调用方法(1)
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);

        //调用方法(2)
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);

//        int by = fis.read();
//        while (by != -1) {
//            System.out.print((char) by);
//            by = fis.read();
//        }

        //优化上面的程序
        int by;
        while((by=fis.read())!=-1){
            System.out.print
                    ((char) by);
        }


        //释放资源
        fis.close();
    }
}
