package com.company;
// using method
public class object_initialization2 {
    String color;
    int age;
    void initobject(String a,int b){
        color=a;
        age=b;

    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {

        object_initialization2 mayank = new object_initialization2();
        mayank.initobject("black",21);
        mayank.display();

        object_initialization2 stani= new object_initialization2();
        stani.initobject("white",20);
        stani.display();


    }
}
