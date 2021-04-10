package com.tacoscloud.tacos.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tim");
        list.add("Ben");
        list.add("Jacob");
        long count = list.stream().count();
        System.out.println(count);

        list.stream().forEach(e->System.out.println(e));

        long filterCount = list.stream().filter(e-> filterDemo(e)).count();
        System.out.println(filterCount);

        List<String> abc = Stream.of("a","b","c").collect(Collectors.toList());

        abc.stream().map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(e->System.out.println(e));

    }

    // filter
    public static boolean filterDemo(String name) {
        if(name.equals("Tim") || name.equals("Ben")) {
            return true;
        }
        return false;
    }
}
