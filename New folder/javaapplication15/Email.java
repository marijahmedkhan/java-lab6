/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author MARIJ AHMED
 */
public class Email extends Message{
    private String sender;
    private String reciever;
    private String subject;
    
    public Email(String text,String sender,String reciever,String subject){
        super(text);
        this.sender=sender;
        this.reciever=reciever;
        this.subject=subject;
    }
    public String getSender(){
        return sender;
    }
     public String getReciever(){
        return reciever;
    }
      public String getSubject(){
        return subject;
    }
      public void setSender(String sender){
          this.sender=sender;
   }
      public void setReciever(String reciever){
          this.reciever=reciever;
      }
      public void setSubject(String subject){
          this.subject=subject;
      }
    @Override
      public String toString(){
          return("Email:"+"\nFrom: "+sender +"\n"+"To: "+reciever+"\n"+"Subject: "+subject +"\n"+"Text: "+text);
      }
}