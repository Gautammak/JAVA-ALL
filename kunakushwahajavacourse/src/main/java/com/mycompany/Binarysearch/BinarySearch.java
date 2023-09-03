/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Binarysearch;

/**
 *
 * @author Admin
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-18,12,-4,0,2,3,4,15,16,18,22,45,89,44};
        int target  = 22;
        int  ans  = binarysearch(arr, target);
        System.out.println(ans);
        
    }

    //return the index
    //return -1 if it does not exits

    static int binarysearch(int[] arr, int target){

     int start = 0;
     int end = arr.length -1;
     while(start <= end){
 //find the middle element
        //int mid = (start + end)/2; // might be possible that (start + end) excced range in java
    
         int mid = start + (end - start) /2;

         if(target < arr[mid]){
            end = mid-1;

         } else if(target > arr[mid]) {
            start = mid +1;

         } else {
            return mid;
         }
    
        }
    return -1;
   
    
}

}