package cn.itcast.test;


import cn.itcast.pojo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {

        List userList =new ArrayList();


        userList.add(new Student("tom",20));
        userList.add(new Student("jam",15));
        userList.add(new Student("lucy",29));

        System.out.println(userList);

//        userList.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
//
//        System.out.println(userList);


        Collections.sort(userList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(userList);
    }
}
