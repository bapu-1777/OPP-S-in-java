package com.company;

public class constructor {

//    public static void main(String[] args) {
//        new constructor();
//    }
//    public constructor(){
//        System.out.println("constructors");
//    }
    String name;
    int income;
    constructor(String n, int i){

        name=n;
        income=i;
        System.out.println(name +" "+ income);
    }

    public static void main(String[] args) {

        constructor e1=new constructor("mayank",21);
        constructor e2=new constructor("satani",51);


    }

}
