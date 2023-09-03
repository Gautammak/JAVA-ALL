/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinearSearch;

/**
 *
 * @author Admin
 */
public class SeachInRange3 {
    public static void main(String[] args) {
        int arr[] ={18,12 ,-7,4,3,14,28};
        int target =3;
       System.out.println(linearSearch(arr, target, 1,4));
        
    }

    
 //search in the array:  return the index if idem is found 
 //othere if item is found return-1
 static int linearSearch(int[] arr,int target,int start,int end){
    if(arr.length == 0){
        return -1;
    }






    
     //run for loop
    for (int index= start; index <= end; index++) {
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
