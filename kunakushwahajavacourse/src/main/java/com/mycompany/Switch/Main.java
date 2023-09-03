/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Switch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // String fruit = in.next();

       // switch (fruit) {
            // case " mango":
            // System.out.println("king of fruit");
            // break;
            // case "Apple":
            // System.out.println("a sweet fruit");
            // break;
            // case "orange":
            // System.out.println("round fruit");
            // break;
            // case "grapes":
            // System.out.println("small fruit");
            // default:
            // System.out.println("enter valid fruit");

            // case " mango" -> System.out.println("king of fruit");

            // case "Apple" -> System.out.println("a sweet fruit");

            // case "orange" -> System.out.println("round fruit");

            // case "grapes" -> System.out.println("small fruit");
            // default -> System.out.println("enter valid fruit");

        //}

        // String a = "gautam";
        // String b = "gautam";
        // System.out.println(a == b);//true
  

         int day = in.nextInt();
        //  switch (day) {
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("monday");
        //     case 3 -> System.out.println("Thurshday");
        //     case 4 -> System.out.println("friday");
        //     case 5 -> System.out.println("satureday");
        //     case 6 -> System.out.println("sunday");  
         
        //  }
        
        //  switch (key) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     System.out.println("weekday");
        //         break;
        //     case 6: 
        //     case 7:
        //     System.out.println("weekend");
        //         break;
        //  }

        switch(day){
            case 1,2,3,4,5->System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }



}

       



}
