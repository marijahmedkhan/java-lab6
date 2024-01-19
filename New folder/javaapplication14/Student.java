/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author MARIJ AHMED
 */
public class Student extends Person{
    private int id;
    private String course;
    private String teacherName;
    public Student(int id,String course,String teacherName,String firstName,String lastName){
        super(firstName,lastName);
        this.id=id;
        this.course=course;
        this.teacherName=teacherName;
    }
    @Override
    public void  displayPerson(){
        super.displayPerson();
        System.out.println("Student details: ");
        System.out.println("Id: "+id);
        System.out.println("Course: "+course);
        System.out.println("Teacher: "+teacherName);
    }
    
}
