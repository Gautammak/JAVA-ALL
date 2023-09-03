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
public class do_while {
    
    public static void main(String[] args){
    
//    int num;
//        System.out.println("enter any num");
//        Scanner s =new Scanner(System.in);
//        
//        num = s.nextInt();
//        do{
//           System.out.println("learn coding");
//        }while(num < 0);
      int num;
        System.out.println("enter any num");
        Scanner s =new Scanner(System.in);
        
       num = s.nextInt();
        do{
          System.out.println(num+ "");
          ++num;
       }while(num <= 10);

    
    
    }
    
}
