/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Binarysearch;

/**
 *
 * @author Admin
 */
public class OrderAgnosticBS {
    public static void main(String[] args) {
      //  int arr[] = {-18,12,-4,0,2,3,4,15,16,18,22,45,89,44};
      int arr[] = {-18,12,-4,0,2,3,4,15,16,18,6,4,4,4,3,3,3,5,4,6,7,8,22,45,89,44};
        int target  = 22;
        int  ans  = OrderAgnosticBs(arr, target);
        System.out.println(ans);
        
        
    }

    static int OrderAgnosticBs(int[] arr, int target) {
    
     int start = 0;
     int end = arr.length -1;

     //find whether the array is sorted in ascending or descending

     boolean isAsc = arr[start] < arr[end];

     
     while(start <= end){
        //find the middle element
   //      int mid = (start + end)/2; // mght be possible that (start + end) excced range in java
    
         int mid = start + (end - start) /2;

         if( arr[mid] == target){
            return mid;

         } 
           if(isAsc){
          if(target < arr[mid]) {
            end  = mid-1;

          } else{
            start = mid+1;
          }
        } else
        {
            if(target > arr[mid]) {
              end  = mid-1;
  
            } else {
              start = mid+1;
            }
          }
    

    }
    return -1;
    
}
}
