package com_2week.com_01.test_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<String, Student>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 22);
        Student s3 = new Student("王祖贤", 58);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

        Set<String> ketSet = hm.keySet();
        for (String key : ketSet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

        System.out.println("--------------");

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        for (Map.Entry<String, Student> me : entries) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
