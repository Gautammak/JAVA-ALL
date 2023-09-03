package com.mycompany.conditional;

import java.util.Scanner;

public class Calculator7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press X or x
//        int ans = 0;
//        while(true){
//            //take the  operator as input
//            System.out.print("Enter the operator");
//
//            char op = in.next().trim().charAt(0);
//           
//            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                //input two number
//                System.out.print("Enter two number");
//
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//              
//
//                if(op == '+'){
//                    ans = num1 + num2;
//                }
//                if(op == '-'){
//                    ans = num1 - num2;
//                }
//                if(op == '*'){
//                    ans = num1 * num2;
//                }
//                if(op == '/'){
//                    if(num2 != 0){
//                    ans = num1 / num2;
//                }
//            } 
//            if(op == '%'){
//                
//                ans = num1 % num2;
//            }
//         } else if(op == 'x' || op == 'X'){
//                break;
//            } else{
//                System.out.println("Invalid operation");
//            }
//        
//        System.out.println(ans);
//    
//        }
           
//type 2
//                   int ans = 0;
//        OUTER:
//        while (true) {
//            System.out.print("Enter the operator");
//            char op = in.next().trim().charAt(0);
//            switch (op) {
//                case '+':
//                case '-':
//                case '*':
//                case '/':
//                case '%':
//                    //input two number
//                    System.out.print("Enter two number");
//                    int num1 = in.nextInt();
//                    int num2 = in.nextInt();
//                    if(op == '+'){
//                        ans = num1 + num2;
//                    }   if(op == '-'){
//                        ans = num1 - num2;
//                    }   if(op == '*'){
//                        ans = num1 * num2;
//                    }   if(op == '/'){
//                        if(num2 != 0){
//                            ans = num1 / num2;
//                        }
//                    }       if(op == '%'){
//                        
//                        ans = num1 % num2;
//                    }       break;
//                case 'x':
//                case 'X':
//                    break OUTER;
//                default:
//                    System.out.println("Invalid operation");
//                    break;
//            }
//            System.out.println(ans);
//        }

                   int ans = 0;
        OUTER:
        while (true) {
            System.out.print("Enter the operator");
            char op = in.next().trim().charAt(0);
            switch (op) {
                case '+', '-', '*', '/', '%' -> {
                    //input two number
                    System.out.print("Enter two number");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    if(op == '+'){
                        ans = num1 + num2;
                    }   if(op == '-'){
                        ans = num1 - num2;
                    }   if(op == '*'){
                        ans = num1 * num2;
                    }   if(op == '/'){
                        if(num2 != 0){
                            ans = num1 / num2;
                        }
                    }       if(op == '%'){
                        
                        ans = num1 % num2;
                    }
                }
                case 'x', 'X' -> {
                    break OUTER;
                }
                default -> System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}