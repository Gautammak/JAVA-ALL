package com.mycompany.conditional;



public class CountNums6 {
    public static void main(String[] args) {
       // Q:  conut the number of repeated number
        int n = 45535;

        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 5){
                count++;
            }

            n = n/10; // n /= 10
        }
        
        System.out.println(count);

    }

    
}
