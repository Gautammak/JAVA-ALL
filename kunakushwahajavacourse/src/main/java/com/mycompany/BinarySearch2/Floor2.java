/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BinarySearch2;

/**
 *
 * @author Admin
 */
public class Floor2{
    
    
    

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target  = 15;
        int  ans  = binarysearch(arr, target);
        System.out.println(ans);
        
    }

    //return the index
    //=greatest  number <= target

    static int binarysearch(int[] arr, int target){

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
    return end;
   
    
}

}
    

