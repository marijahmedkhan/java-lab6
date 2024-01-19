/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author MARIJ AHMED
 */
public class JavaApplication13 {

   
    public static void main(String[] args) {
        Birthday b1=new Birthday(9,"July", 2004);
        Address a1=new Address(20341,"Karachi","Sindh","Pakistan");
        Person p1=new Person("Marij", b1, a1);
        p1.display();
    }
    
}
