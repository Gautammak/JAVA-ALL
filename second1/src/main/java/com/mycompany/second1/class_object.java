/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */
public class class_object{ 
// class object=class_object    or we can use object as any now use person object

    
   int age = 21;
   int weight = 56;
   String color = "light";
     void eat()
     {
         System.out.println("eat");
     }
    void sleep()
    {
        System.out.println("sleep");
    }
     
   
        public static void main(String[] args){
            class_object p = new class_object();
            System.out.println(p.age);
            System.out.println(p.color);
            System.out.println(p.weight);
            p.eat();
            p.sleep();
            
        }
}
