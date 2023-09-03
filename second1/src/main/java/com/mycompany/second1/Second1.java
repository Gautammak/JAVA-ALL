/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.second1;

/**
 *
 * @author Admin
 */
//2
public class Second1 {
    
    int a=10;  //local value
    static double b =20.5;   // static value
    

    public static void main(String[] args) {
       // System.out.println("Hello World!");
       
       boolean c = true;   //instant value
       Second1 s = new Second1();
       System.out.println(s.a  + " " + b+  " " + c);
//        System.out.println(s.a);
//        System.out.println(b);
//        System.out.println(c);
    }
    
}
