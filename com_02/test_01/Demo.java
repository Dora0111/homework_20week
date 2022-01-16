package com_2week.com_02.test_01;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("java.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.delete());
    }
}
