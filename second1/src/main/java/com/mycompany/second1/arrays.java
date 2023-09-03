/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;
//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class arrays {
    
    public static void main(String[] args ){
       //  int a[]  = {10,20,30,40,50}; method 1
         
        // System.out.println(a[2]);  for get value
        // System.out.println(a[4]);
        
// 1        for(int b : a){
// 1           System.out.println(b+ " ");
// 1       }
        
//1 dimension        int a[] = new int[5];
//        System.out.println("enter array");
//        Scanner s = new Scanner(System.in);
//        for(int i = 0; i<5;i++)
//            
//        
//        {
//            a[i]= s.nextInt();
//        }
//           Arrays.sort(a);
//        System.out.println("\n array elements: ");
//        
//        for(int b : a)
//        {
//          System.out.print(b+ " ");
//      }
       int a[][] = new int[2][2];
        System.out.println("enter array elements");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
              a[i][j]= s.nextInt();
            }
        }
        
        System.out.println("\n matrix element:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
              System.out.print( a[i][j]+" ");
            }
            System.out.println();
        }
           
    }
    
}
