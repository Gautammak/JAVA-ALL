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
//4
public class practice {
      public static void main(String[] args){
    
    int age;
         System.out.println(" enter password");
         Scanner obj = new Scanner(System.in);
         
         age = obj.nextInt();
         if(age ==21)
         {
             System.out.println("  you can give vote");
         }
         else
         {
              System.out.println("you can't");
             
         }
      } 
    
}
