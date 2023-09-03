/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BinarySearch2;

/**
 *
 * @author Admin
 */
public class Ceiling1 {
    
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target  = 15;
        int  ans  = BinarySearch(arr, target);
        System.out.println(ans);
        
    }

    //return the index
    //of smallest  no>= target

    static int BinarySearch(int[] arr, int target){
      //but what if the target is greter than the greatest number in the array

      if(target > arr[arr.length-1]){
         return -1;
      }

     int start = 0;
     int end = arr.length -1;
     while(start <= end){
        //find the middle element
   //      int mid = (start + end)/2; // mght be possible that (start + end) excced range in java
    
         int mid = start + (end - start) /2;

         if(target < arr[mid]){
            end = mid-1;

         } else if(target > arr[mid]) {
            start = mid +1;

         } else {
            return mid;
         }
    
        }
    return start;
   
    
}

}
    

