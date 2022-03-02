package com.company;
// by reference variable
public class object_initialization {
    String color;
    int age;
    public static void main(String[] args) {

        object_initialization mayank = new object_initialization();
        mayank.color="black";
        mayank.age=21;
        System.out.println(mayank.color+" "+mayank.age);

        object_initialization satani = new object_initialization();
        satani.color="white";
        satani.age=20;
        System.out.println(satani.color+" "+satani.age);
    }
}
