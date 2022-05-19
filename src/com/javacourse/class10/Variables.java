package com.javacourse.class10;

public class Variables {
    public static void main(String[] args) {

        // Java Convention
        int age = 20;
        String name = "Pedro";
        String myCatsName = "Russo";
        String year2022 = "2022";

        // Accepted, but not used.
        int _age;
        int $age;

        // It's not Java convention
        String my_cats_name;
        String MyCatsName;
        String myCatsname;

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);

        // Bad practice.
        int a = 10;
        String b = "Pedro";
    }
}
