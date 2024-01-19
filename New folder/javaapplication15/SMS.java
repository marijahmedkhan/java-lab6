/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author MARIJ AHMED
 */
public class SMS extends Message {
    private String recipientConNO;
    
    public SMS(String text,String recipientConNO){
        super(text);
        this.recipientConNO=recipientConNO;
    }
    public String getRecipientConNo(){
        return(recipientConNO);
    }
    public void setRecipientConNO(String recipientConNO){
        this.recipientConNO=recipientConNO;
    }
    @Override
    public String toString(){
        return("SMS to: "+recipientConNO+"\n"+"Text: "+text);
    }
}
