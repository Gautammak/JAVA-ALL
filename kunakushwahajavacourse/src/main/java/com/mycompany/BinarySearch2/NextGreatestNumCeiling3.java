/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BinarySearch2;

/**
 *
 * @author Admin
 */
public class NextGreatestNumCeiling3 {

    
   
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target  = 'd';
        char  ans  = letter(letters, target);
        System.out.println(ans);
        
    }

    //return the index
    //of smallest  no>= target

  public  static char letter(char[] str, char target){
      //but what if the target is greter than the greatest number in the array

      
     int start = 0;
     int end = str.length -1;
     while(start <= end){
        //find the middle element
   //      int mid = (start + end)/2; // mght be possible that (start + end) excced range in java
    
         int mid = start + (end - start) /2;

         if(target < str[mid]){
            end = mid-1;

         } else  {
            start = mid +1;

     }
    
        }
    return str[start%str.length];
   
    
}

    
    
    
    
}
