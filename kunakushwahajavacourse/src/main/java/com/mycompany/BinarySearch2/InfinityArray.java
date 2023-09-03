///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.BinarySearch2;
//
///**
// *
// * @author Admin
// */
//public class InfinityArray {
//    public static void main(String[] args) {
//        int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
//        int target  = 10;
//        int  ans  = binarysearch(arr, target);
//        System.out.println(ans);
//        
//    }
//
//    public static int ans(int[] arr, int target){
//        //first find the range
//        //fisrt start  with a box of size 2
//        int start = 0;
//        int end = 1;
//        //condition for the target to lie in range 
//        while(target > arr[end]){
//            int temp = end +1;
//            //double the box value
//            //end previous end + sizeofbox*2
//            end = end +(end-start+1) *2;
//            start = temp;
//
//
//
//
//        }
//
//
//      return binarysearch(arr, target, start ,end);
//    }
//
//    //return the index
//    //return -1 if it does not exits
//
//    static int binarysearch(int[] arr, int target){
//
//     int start = 0;
//     int end = arr.length -1;
//     while(start <= end){
// //find the middle element
//        //int mid = (start + end)/2; // might be possible that (start + end) excced range in java
//    
//         int mid = start + (end - start) /2;
//
//         if(target < arr[mid]){
//            end = mid-1;
//
//         } else if(target > arr[mid]) {
//            start = mid +1;
//
//         } else {
//            return mid;
//         }
//    
//        }
//    return -1;
//   
//    
//}
//    
//    
//}
