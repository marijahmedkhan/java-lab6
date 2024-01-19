/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author MARIJ AHMED
 */
public class Person {
    private String firstName;
    private String lastName;
    
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    } 
    public String getName1(){
        return(firstName);
}
    public String getName2(){
        return(lastName);
    }
    public void setName1(String firstName){
        this.firstName=firstName;
    }
    public void setName2(String lastName){
        this.lastName=lastName;
    }
    public void displayPerson(){
        System.out.println("Person Details: ");
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
    }
    }

