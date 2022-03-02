package com.company;
// compile time - static - method overloading
public class polymorphism extends method_overriding{

    void show(int a){
        System.out.println("1");
    }
    void  show(){
        System.out.println("2");
    }
    void test(){
        System.out.println("class - polymorphism , method - test");
    }

    public static void main(String[] args) {
        polymorphism mayank = new polymorphism();
        mayank.show();
        mayank.test();
    }
}
// different class - dynamic
class method_overriding{

    void test(){
        System.out.println("class - method overriding , method - test");
    }

}
