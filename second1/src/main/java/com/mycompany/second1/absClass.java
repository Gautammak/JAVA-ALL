/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */

 abstract class Animal {
             void legs()
             {
                 System.out.println("all animal have 4 legs");
             }
             
             abstract void sound();
              abstract void eat();
}

class dog extends Animal
{
       
        @Override
        void sound()
    {
        System.out.println("BOW BOW..");
     }
        
        @Override
        void eat()
        {
            System.out.println(" MEAT eating");
        }
}
        
        class cow extends Animal
{
       
        @Override
        void sound()
    {
        System.out.println("ooo ooo.");
     }
        
        @Override
        void eat()
        {
            System.out.println(" grasseating");
        }
}

public class absClass {
    
    public  static void main(String[] args)
    {
        dog d = new dog();
        cow c = new  cow();
        
        d.sound();  d.eat(); d.legs();
        c.eat(); c.sound(); c.legs();
    }
    
    
}
    

