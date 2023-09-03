/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */
public class Exception1 
{
    
    public static void main(String[] args) {
        int a =10,b=0,c;
        
        try{
        c = a/b; //c =10;
        System.out.println(c);
        }
        
       catch(Exception e)
        {
            System.out.println("cant devide by zero");
        }
        System.out.println("main method ended");
    }
    
    }
