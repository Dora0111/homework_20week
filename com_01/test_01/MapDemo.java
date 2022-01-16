package com_2week.com_01.test_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String, String>();

        // 添加元素 使用put方法
        // 键值是唯一的 不可以重复 会覆盖原来的元素 相当于修改原来的元素

        map.put("001","里全部拧");
        map.put("002", "王祖贤");
        map.put("003","大胡思");

        //输出集合对象
        System.out.println(map);
    }
}
