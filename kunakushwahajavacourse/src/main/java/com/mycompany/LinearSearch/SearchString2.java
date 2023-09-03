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
public class SearchString2 {
    public static void main(String[] args) {
        String name = "Gautam";
        char target = 'u';

      //  System.out.println(seach(name,target));
      System.out.println(Arrays.toString(name.toCharArray()));
    } 

    static boolean seach2(String str,char target){
        if(str.length() == 0){
            return false;
        }

         for (char  ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
            
         }
          return false;
    }


    static boolean seach(String str,char target){
        if(str.length() == 0){
            return false;
        }

         for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
            
         }
          return false;
    }

}
