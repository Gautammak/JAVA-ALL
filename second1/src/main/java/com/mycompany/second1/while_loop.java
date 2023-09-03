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
public class while_loop {
    
    
    public static void main(String[] args){
        int num;
        System.out.println("enter any num");
        
        Scanner s =new Scanner(System.in);
                  num =  s.nextInt();
          
          while(num>=0)
          {
          
           if(num%2==0)
            {
              System.out.println("even number");
              break;
            }
          
          else{
              System.out.println("odd number");
              break;
          }
          
          }
          
          System.out.println("while loop exexcute");
                  
    }
    
}
