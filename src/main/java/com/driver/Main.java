package com.driver;

public class Main {
    public static void main(){
        RWOnly rwOnly=new RWOnly();
        // Task 4: Try setting a value to 'name' directly and print it (will result in error)
        // obj.name = "John"; // This will give an error
        // System.out.println(obj.name); // This will also give an error
        rwOnly.setName("Rahul");
        String retrieveName=rwOnly.getName();
        System.out.println(retrieveName);
    }
}