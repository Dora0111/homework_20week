package com_2week.com_02.test_08;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        BufferedOutputStream bos =new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fos.txt"));
//        //写数据-------
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        //释放资源
//        bos.close();


        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("fos.txt"));
//        int by;
//        while((by=bis.read())!=-1){
//            System.out.println((char) by);
//        }
//        bis.close();

        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));

        }

    }
}
