/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */

//method overlodin without inheritance  compitime
//public class methodoverloding_polymorphysims {
//    
//    void add()
//    {
//      
//          int a = 10 ,b =20 ,c;
//          c = a+b;
//          System.out.println(c);
//           
//    }
//    
//    void add(int x ,int  y)
//    {
//      
//          int c;
//          c = x+y;
//          System.out.println(c);
//           
//    }
//    
//    void add(int x , double y)
//    {
//      
//         double c;
//          c = x+y;
//          System.out.println(c);
//           
//    }
//    
//    public static void main(String[] args)
//    {
//        polymorphysims r = new polymorphysims();
//         r.add(); r.add(20,20); r.add(34,45.55);
//        
//    }
//    
//}


//public class polymorphysims {
//    
//    int add()
//    {
//      
//          int a = 10 ,b =20 ,c;
//          c = a+b;
//          return c;
//           
//    }
//    
//    void add(int x ,int  y)
//    {
//      
//          int c;
//          c = x+y;
//          System.out.println(c);
//           
//    }
//    
//    void add(int x , double y)
//    {
//      
//         double c;
//          c = x+y;
//          System.out.println(c);
//           
//    }
//    
//    public static void main(String[] args)
//    {
//        polymorphysims r = new polymorphysims();
//        int add =  r.add(); r.add(20,20); r.add(34,45.55);
//        System.out.println(add);
//    }
//    
//}

class shape
{
    void draw()
    {
        System.out.println("can't say shape type");
    }
}

class square extends shape
{
    
     @Override
     void draw()
     {    
         super.draw();
         System.out.println("square shape");
     }
}

public class polymorphysims{
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
        
    }
            
    
}