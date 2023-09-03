/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinearSearch;

/**
 *
 * @author Admin
 */
public class MaxWealth {
    public static void main(String[] args) {
        
    }

    public int maximum(int[][] accounts){
        //person = row
        //accounts = coll
        int ans = Integer.MIN_VALUE;

        // for(int person = 0; person < accounts.length; person++){
        //     //when you  start a new col , take a new sum for that row
        //    int sum = 0;
        //     for(int account = 0; account<accounts[person].length;account++){
        //         sum += accounts[person][account];
        //     }

       
       // enhance for loop
       for(int[] ints : accounts ){
        int sum = 0;
       
       for(int anInt : ints){
        sum += anInt;
       }



            //now we have sum of accounts of person
            //check with overall ans
            if(sum > ans){
                ans = sum;
            }
    }
        return ans;
    }
   
    
}
