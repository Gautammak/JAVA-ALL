package com.mycompany.firstjava;
import java.util.Scanner;

public class Temparature7 {
    public static void main(String[] args) {
         try (//Temparatur convertor program
    Scanner in = new Scanner(System.in)) {
        System.out.print("please enter temp in c:");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);
    }


        
    }
    
}
