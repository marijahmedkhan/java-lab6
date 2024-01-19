/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author MARIJ AHMED
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s1=new Student(67,"Oops","Sir Saleem","Marij", "Ahmed");
       Teacher t1=new Teacher("Marij","Ahmed","Oops", 100000);
       s1.displayPerson();
       t1.displayPerson();
    }
    
}
