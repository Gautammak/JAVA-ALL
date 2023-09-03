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
public class switch_operators {
    
    public static void main(String[] args) {
        
        int a,b,c,ch;
        System.out.println("enter num");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        //swich and arithmetic operators
//        System.out.println("enter choice");
//        ch = s.nextInt();
//        
//        switch(ch)
//        {
//            case 1:
//                c=a+b;
//                System.out.println("addition"+c);
//                break;
//    
//            case 2:
//                c=a-b;
//                System.out.println("subtraction"+c);
//                break;
//        
//            case 3:
//                c=a*b;
//                System.out.println("multiply"+c);
//                break;
//                
//            case 4:
//                c=a/b;
//                System.out.println("division"+c);
//                break;
//                
//            case 5:
//                c=a%b;
//                
//                System.out.println("modulo"+c);
//                break;
//                
//            default: 
//                System.out.println("invalid choice");
//        }



//relational operator

//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);

//logical operator



//        System.out.println(a==b && a!=b);
//        System.out.println(a==b  || a!=b);
//        System.out.println(!(a>b));
        
    //increment decrement operator
    
//        System.out.println(a--);  //10   --->9
//        System.out.println(--a);  //8   
//        System.out.println(a++);  //8   --->9
//        System.out.println(++a);  //10

   //assignment operator
   
//         a+=10;
//         b+=20;
//        System.out.println(a);
//        System.out.println(b);
//        
       // conditional turnary operator
       
    int r =   (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
        
      
        
        
        
    }
    
}
