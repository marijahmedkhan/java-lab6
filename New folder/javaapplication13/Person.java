/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author MARIJ AHMED
 */
public class Person {
    private String name;
    Birthday dob;
    Address add;
    
    public Person(String name,Birthday dob,Address add){
        this.name=name;
        this.dob=dob;
        this.add=add;
    }
    public void display(){
        System.out.println("Details:");
        System.out.println("Name: "+name);
        System.out.println("");
        System.out.println("Date of birth: ");
        System.out.println("Date: "+dob.getDate());
        System.out.println("Month: "+dob.getMonth());
        System.out.println("Year: "+dob.getYear());
        System.out.println("");
        System.out.println("Address:");
        System.out.println("Zipcode: "+add.getCode());
        System.out.println("City: "+add.getCity());
        System.out.println("Province: "+add.getProvince());
        System.out.println("Country: "+add.getCountry());
    }
}
