/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guessnumber;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guessnumber {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
      Scanner sc = new Scanner(System.in);
      int myNumber = (int)(Math.random()*100);
      int  userNumber = 0;
      
       do{
           System.out.println("guess my number");
            userNumber = sc.nextInt();
            
           if(userNumber == myNumber){
               System.out.println("correct number");
               break;
           }
           else if(userNumber > myNumber){
               System.out.println("your number is too large");
           }
           else {
                System.out.println("your number is small");
       }
        
    }
       while(userNumber >= 0);
        System.out.println("my number was");
        System.out.println(myNumber);
    }
}
