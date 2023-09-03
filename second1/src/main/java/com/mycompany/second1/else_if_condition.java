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
//7
public class else_if_condition {
    public static void main(String[] args){
    
        
        int marks;
        System.out.println("enter marks:");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextInt();
    if( marks >= 60 && marks <=100)
    {
        System.out.println("first divison");
    } 
    else if(marks >=45 && marks<60)
    {
         System.out.println("second divison");
    
    }
    
    else if(marks >=33 && marks<45){
        System.out.println("third divison");
        
    }
    
    else
    {
        System.out.println("failed");
    }
    
    
}
}
