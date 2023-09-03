/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinearSearch;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class searchin2darray4 {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {43,3,3},
            {34,4,4},
            {4,5,7}
        };
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);

    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return  new int[]{ row,col};
                }
                
            }
            
        }

        return new int[]{-1,-1};

    } 

    // static int max(int[][] arr){
    //     int max = Integer.MIN_VALUE;
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if(arr[row][col] > max){
    //                 max = arr[row][col];
    //             }
                
    //         }
            
    //     }

   // or soluttion
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if(elements> max){
                    max = elements;
                }
                
            }
            
        }

        return max;

    }
    
}
