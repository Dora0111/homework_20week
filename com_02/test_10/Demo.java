package com_2week.com_02.test_10;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys));

        String ss = new String(bys);
        System.out.println(ss);
    }
}
