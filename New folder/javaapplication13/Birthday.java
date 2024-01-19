 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author MARIJ AHMED
 */
public class Birthday {
    private int date;
    private String month;
    private int year;
    
    public Birthday(int date,String month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    } 
    public int getDate(){
        return(date);
    }
    public String getMonth(){
        return(month);
    }
    public int getYear(){
        return(year);
    }
}
