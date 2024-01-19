/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author MARIJ AHMED
 */
public class Teacher extends Person {
    private String subjectName;
    private int salary;
    
    public Teacher(String firstName,String lastName,String subjectName,int salary){
        super(firstName,lastName);
        this.subjectName=subjectName;
        this.salary=salary;
    }
    @Override
    public void displayPerson(){
        super.displayPerson();
        System.out.println("Teacher details: ");
        System.out.println("Subject name: "+subjectName);
        System.out.println("Salary: "+salary);
    }
}
