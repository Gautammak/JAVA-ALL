/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
//8
public class nested_if_else {
    public static void main(String args[] ){
        
        int num1 ,num2, num3;
        System.out.println("enter num");
        Scanner obj = new Scanner(System.in);
        
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
        
        //int num1=10 ,num2=122, num3=122;
        
       if( num1>num2)
       {
           if(num1>num3)
           {
               System.out.println("max is:"+num1);
           }
           else
           {
               System.out.println("max is:" +num3);
           }
           
       }
       
       else
       {
           if(num2>num3){
               System.out.println("max is:"+num2);
           }
           
           else
           {
               System.out.println("max num:"+num3);
           }
               
       }
    }
    
}
