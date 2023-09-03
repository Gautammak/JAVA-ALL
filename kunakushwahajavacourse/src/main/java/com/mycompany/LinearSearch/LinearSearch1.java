/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinearSearch;

/**
 *
 * @author Admin
 */

/**
 *
 * @author Admin
 */
public class LinearSearch1 {
 public static void main(String[] args) {
    int[]  nums = {23,45,1,2,8,19,-3,16,11,28};
    int target =19;
    int ans = LinearSearch(nums, target);
    System.out.println(ans);


    
 }

 static boolean LinearSearch3(int[] arr,int target){
    if(arr.length == 0){
        return false;
    }

     //run for loop
    for (int element : arr) {
        //check for element at every index
       
        if(element == target){
            return true;
        }
        
    }
    // this line will execute if none of the return statement above have executed
    //hende target is not found
    return false;
 
    
}





  
 //search the target and  return the element
 static int LinearSearch2(int[] arr,int target){
    if(arr.length == 0){
        return -1;
    }

     //run for loop
    for (int element : arr) {
        //check for element at every index
       
        if(element == target){
            return element;
        }
        
    }
    // this line will execute if none of the return statement above have executed
    //hende target is not found
    return Integer.MAX_VALUE;
 
    
}











 //search in the array:  return the index if idem is found 
 //othere if item is found return-1
 static int LinearSearch(int[] arr,int target){
    if(arr.length == 0){
        return -1;
    }






    
     //run for loop
    for (int index= 0; index < arr.length; index++) {
        //check for element at every index
        int element = arr[index];
        if(element == target){
            return index;
        }
        
    }
    // this line will execute if none of the return statement above have executed
    //hende target is not found
    return -1;
 }
    
}


