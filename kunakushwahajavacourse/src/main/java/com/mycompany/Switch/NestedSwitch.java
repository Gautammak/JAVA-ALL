/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.Switch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();


        // switch (empid) {
        //     case 1:
        //     System.out.println("gautam makavana");   
        //         break;
        //         case 2:
        //     System.out.println("gautam ");   
        //         break;
        //         case 3:
        //         System.out.println("emp number 3");
        //      switch (department) {
        //         case "IT":
        //         System.out.println("it department");
        //          break;
        //          case "Management":
        //         System.out.println("Management department");
        //          break;
        //         default:
        //           System.out.println("no department");
        //      }
             
        //      default:
        //       System.out.println(" enter coreect department");
           
        // }

        switch (empid) {
            case 1-> System.out.println("gautam makavana");   
            case 2->  System.out.println("gautam ");   
            case 3 -> { System.out.println("emp number 3");
            switch (department) {
                case "IT"->  System.out.println("it department"); 
               case "Management"->System.out.println("Management department");
                default-> System.out.println("no department");
             }
            }
             
             default->  System.out.println(" enter coreect department");
            
        }
    }

}
