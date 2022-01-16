package com_2week.com_02.test_03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 做了三件事情
        // 调用系统功能、创建了字节输出流对象、让字节输出流对象指向创建好的文件

        //写数据的三种方式
        //第一种
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);

        //第二种
//        byte[] bys = {97, 98, 99, 100, 101};
        byte[] bys = "abcdefg".getBytes();//根据字符串得到字节数组
        fos.write(bys);

        //第三种
        fos.write(bys,0,2);

        //如何释放资源呢？
        //一定不要忘记这一步
        fos.close();//不要忘记释放资源
    }
}
