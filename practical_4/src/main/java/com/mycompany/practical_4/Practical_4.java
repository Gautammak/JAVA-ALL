/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical_4;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Practical_4 {

   static void findDeterminent(int[][] arr){
       int val1 = (arr[1][1]*arr[2][2]) -  (arr[1][2]*arr[2][1]);
       int val2 = (arr[1][0]*arr[2][2]) -  (arr[1][2]*arr[2][0]);
       int val3 = (arr[1][0]*arr[2][1]) -  (arr[1][1]*arr[2][1]);
       
       int finalValue = (arr[0][0]*val1)- (arr[0][1]*val2)-(arr[0][2]*val3);
       System.out.println("Determinent of a matrix " +finalValue);
   }
   
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int arr[][] = new int[3][3];
      System.out.println("Enter a (3*3) matrix");
      for(int i=0;i<3;i++){
          for(int j =0 ;j<3;j++){
              arr[i][j] =sc.nextInt();
          }
      }
      
      findDeterminent(arr);
  }
  
}      


