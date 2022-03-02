package com.company;
// is-a
public class inheritance {

    void eat(){
        System.out.println("class - inheritance , method - eat");
    }

}

class test extends inheritance{


    public static void main(String[] args) {

        test mayank = new test();
        mayank.eat();

    }

}