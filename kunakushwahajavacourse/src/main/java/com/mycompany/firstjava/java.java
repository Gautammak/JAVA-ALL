/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.firstjava;
//import java.net.SocketTimeoutException;
//import java.util.*;

//import java.util.Scanner;

/**
 *
 * @author Admin
 */
//function:-collection of code we can again and again
//public :- that calass we can use anywhere
//class: it just name group of property and function
//static: we want to run  main function without creating a object of class Main1
//void: don"t return any value
//args: collection of string 
//System.out.println(args[1]); in cmd we can write javac and argument0- gautam 1-makavana so output 1 for is makavana 
// command line arguments
//javacc is executable file that is located in computer
//download jdk and intellij ide
//sout :System.out.println()
//packge:kunakushwahajavacourse :packege are folder 
//sout: println for print something in system class // for output part
//system:The System class contains several useful class fields and methods. 
//out:he "standard" output stream. This stream is already open and ready to accept output data.
//println:Prints a String and then terminates the line. This method behaves as though it invokes print(String) and then println().
//println for new line
//print for same line
//scanner of input part

public class java {

    public static void main(String[] args) {
       // System.out.println("Hello World!"); // for output part
       // System.out.println(" hey how are you?");
       // Scanner input = new Scanner(System.in); //for input part
        //System.out.println(input.next());
        //System.out.println(input.nextLine());

   
        //primitive

        // int rollno = 64; //4 byte
        // char letter = 'r';//2 byte
        // float marks = 98.67f;//4 byte
        // double largeDecimalNumber =4555555.444;//8 byte
        // long largeinter = 443333L; //8 byte
        // boolean check = false;//1 byte

          
     //input

      //Scanner input = new Scanner(System.in);
    //  System.out.print("please enter some input: ");
    //  int rollno = sc.nextInt();
    //  System.out.println(" your roll number is " + rollno);
      
        // int a = 455;
        // System.out.println(a);

        // String name =  input.next();
        // System.out.println(name);

        // float marks = input.nextFloat();
        // System.out.println(marks);


         // sum program in java

        // Scanner input = new Scanner(System.in);
        //  int num1 = input.nextInt();
        //  int num2 = input.nextInt();

        //  int sum = num1 + num2;

        //  float num1 = input.nextInt();
        //  float num2 = input.nextInt();

        //  float sum = num1 + num2;
         //30 + 40 = 70.0 

        //  float num1 = input.nextFloat();
        //  float num2 = input.nextFloat();

        //  float sum = num1 + num2;
         //30 + 40 = 70.0

        // System.out.println(" sum is  " + sum);



        //TYPE CONVERSION AND CASTING
        
        // Scanner input = new Scanner(System.in);
        // //float num = input.nextFloat();
        // float num = input.nextInt(); //we can convert from float to int but cant int to float
        // System.out.println(num);

     
        //how to convert value from int to float
        // narrowing onversion

             //type  casting
    //    int num = (int)(445.444);
    //    System.out.println(num);


    //automatic type promotion in expressions

    // int  a = 257;
    // byte b = (byte)(a); //257%256 = 1
    // System.out.println(b);


    // byte a = 40;
    // byte b = 50;
    // byte c = 100;
    // int d = (a*b)/c;
    // System.out.println(d);

   // byte b = 50;
    //b = b*2;
    //cannot convert from int to byte

    // int number = 'A'; //65
    // System.out.println(number);

    //java is working on unicode value

   // int number = 'A'; //65 ascii value
    //System.out.println("नमस्ते");
   // System.out.println("(印度)合十礼");//unicode value

    
    //System.out.println(4*5);//20
    //System.out.println(5*6.44);//32.2

    // byte b = 45;
    // char c = 'a';
    // short s = 1024;
    // int i = 50000;
    // float f = 5.333f;
    // double d = 0.333;
    // double result = (f * b ) + (i / c)-(d -s);
    // //float  + int -double = double
    // System.out.println((f*b) + " " +(i / c) + " " +( d -s));
    // System.out.println(result);



   //loops

  
//    if(true){
//     System.out.println("hello world");
//    }
//  int a =10;
//   if(a == 10){
//          System.out.println("hello world");
//        }


//while loop
// int count =1;
// while (count !=5){
//     System.out.println(count);
//     count++;
// }


     //for loop
    //  for(int count =1; count!=5; count++){
    //     System.out.println(count);
    //  }



    //Temparatur convertor program
   //  Scanner in =  new Scanner(System.in);
   //  System.out.print("please enter temp in c:");
   //  float tempC = in.nextFloat();
   //  float tempF = (tempC * 9/5)+32;
   //  System.out.println(tempF);


     }
}
