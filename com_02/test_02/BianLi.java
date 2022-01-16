package com_2week.com_02.test_02;

import java.io.File;

public class BianLi {
    public static void main(String[] args) {
        File file =new File("E:\\JAVA");
        get(file);

    }
    public static void get(File srcFile)
    {
        File [] fileArray=srcFile.listFiles();
        if(fileArray!=null){
            for(File file :fileArray){
                if(file.isDirectory()){
                    get(file);
                }else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
