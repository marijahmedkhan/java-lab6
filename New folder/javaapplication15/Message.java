/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author MARIJ AHMED
 */
public class Message {
    protected String text;
    
    public Message(String text){
        this.text=text;
    }
    public String getText(){
        return(text);
    }
    public void setText(String text){
        this.text=text;
    }
    public String toString(){
        return text;
    }
}
