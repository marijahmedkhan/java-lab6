/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author MARIJ AHMED
 */
public class Address {
    private int zipCode;
    private String city;
    private String province;
   private String country;
    
    public Address(int zipCode,String city,String province,String country){
        this.zipCode=zipCode;
        this.city=city;
        this.province=province;
        this.country=country;
    }
    public int getCode(){
        return(zipCode);
    }
     public String getCity(){
        return(city);
    }
      public String getProvince(){
        return(province);
    }
       public String getCountry(){
        return(country);
    }
}
