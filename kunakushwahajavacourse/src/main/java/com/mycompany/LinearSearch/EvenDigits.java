/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinearSearch;

/**
 *
 * @author Admin
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
     //   System.out.println(FindNumbers(nums)); 
     System.out.println(digits(0)); 
     //System.out.println(digits2(44444));      
    }

    static int FindNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }

        }
        return count;
    }

    //function to check whether numbrer is contain even or not 
 static boolean even(int num){
        int numberOfDigits = digits(num);
     
    // if(numberOfDigits == 0){
    //     return true;
    // }
    // return false;

    return numberOfDigits %2 == 0;
 }

//solution 2
//   static int digits2(int num){
//     if(num < 0){
//         num = num *-1;
//     }
//     return (int)(Math.log10(num));
//   }




    //count number in digits
    static int digits(int num){
        if(num < 0){
            num = num*-1;
        }
         if(num == 0){
            return 1;
         }
        int count = 0;
        while(num > 0){
            count ++;
            num = num/10;
        }
        return count;
    }   
}

