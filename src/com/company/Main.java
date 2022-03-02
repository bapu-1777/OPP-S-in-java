package com.company;

public class Main {


    public void eat(){
        System.out.println("class - main , method - eat");
    }

    public void run(){
        System.out.println("class - main , method - run");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        Main mayank=new Main();
        mayank.eat();
        mayank.run();

        other satani= new other();
        satani.fly();



    }

}
class other{

        public void fly(){
            System.out.println("class - other , method - fly");
        }
}