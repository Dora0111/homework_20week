package com_2week.com_01.test_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        // 添加元素 使用put方法
        // 键值是唯一的 不可以重复 会覆盖原来的元素 相当于修改原来的元素

        map.put("001", "里全部拧");
        map.put("002", "王祖贤");
        map.put("003", "大胡思");

        //清空
//        map.clear();

        //移除
//        map.remove("001");

        //某元素是否存在

        //输出集合对象
        System.out.println(map);

        System.out.println("------------");

//      遍历1
        Set<String>keSet=map.keySet();
        for (String key : keSet) {
            String value = map.get(key);
            System.out.println(key+"  "+value);
        }

        System.out.println("------------");

//      遍历2
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"  "+value);
        }
    }
}
