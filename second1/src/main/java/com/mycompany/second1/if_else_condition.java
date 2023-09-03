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
//5
public class if_else_condition {
    
      public static void main(String[] args){
    
    int pwd;
         System.out.println(" enter password");
         Scanner obj = new Scanner(System.in);
         
         pwd = obj.nextInt();
         if(pwd ==2731)
         {
             System.out.println(" my name: gautam");
             System.out.println(" my aee: 21");
             System.out.println(" my contact: 5544444");
             System.out.println(" my address: navsari");
             System.out.println(" cast: sc");
             
             
         }
         else
              System.out.println("sorry wrong password");
      }
    
}
