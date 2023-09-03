/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apnacollege;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Apnacollege {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        /*
        //System.out.println("Hello java");
         //variable
        /* 
         String name = "Aman";
         int age = 13;
         String neighbour = "akku";
         String friend = neighbour;
        
         //primitive
         byte -1 [-128 to127]
         short -2
         int -4  1,2,3
         long -8
         float -4 3.14
         double -8
         char -2
         boolean -1 true/false
        
        
       byte age = 30;
       int phone =12345;
       long phone2 = 1333444L;
       float pi = 3.14F;
       char letter = '@';
       boolean isadult = false;
         
         //non- primitive
         
       
       
       
        
        String name = new String("Apu"); //3
        String friend = new String("Akku"); //3
        
        System.out.println(name.length());  
        
        
        //string contcate
         
        String name1 = "Apu";
        String name2 = "Akku"; 
        String name3 = name1  + " and " +  name2;
        System.out.println(name3); // aman and akku
          
        //charAt position
        
        String name = "aman";
        System.out.println(name.charAt(0)); //a
        
        //lenght
        String name = "aman";
        System.out.println(name.lenght());//4


        //replace
        //string is immutable //can't change
       String name = "aman";
       String name2 = name.replace('a', 'b');
        System.out.println(name2);//bman
        System.out.println(name); //aman
       
        
        //substring
        
        String name = "Aman and akku";
        System.out.println(name.substring(5,9));//and space


        
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;
        
        int[]  marks = new int[3];
       // boolean[] marks = new boolean[3]; //false
       marks[0] = 97;
       marks[1] = 98;
       marks[2] = 95;
        
        //System.out.println(marks[2]);//95
        
       // length
        //System.out.println(marks.length);//3
        
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]); //95,97,97 after sort
        
      
        
        
        int[]  marks ={97,98,95};
        int[][] finalMarks = {{ 97,98,95},{95,95,98}};
        System.out.println(finalMarks[1][1]);
        //0 student 0 marks  97  first student
        //1 student 1 marks 95    secont student
         // casting

        
        double price = 100.00;   //implicite casting  int into double java allowed
        double finalPrice = price + 18;
        
         System.out.println(finalPrice);
         
         int p = 100;
         int fp = p + (int)18.0;  // explicite casting  int into double
         System.out.println(fp); 

         
      //   constant
      
      int age = 30;
      age = 31;
      age = 32;
      
      final float PI = 3.14F;

        
        //operators
        
       // int a = 1;
       // int b = 2;
        //int sum = a+b;
        //int abtraction = a-b;
        //int mul =a*b;
        //int div = a/b; //0
        //float a = 1;
        //float b = 2; //0.5
        
       // double a = 1;
        //double b = 2;
        //double modulo = a % b;
        //double div = a/b; //0.5
       // System.out.println(modulo);
        
        //int numb = 1;
       // numb = numb + 1;
     // numb++;
     //++numb;
         // System.out.println(numb++);//1
          //System.out.println(++numb);//2
       // System.out.println(numb);//2
        
        //System.out.println(--numb);//0
       // System.out.println(numb--);//1
       // System.out.println(numb);//0

         //math class
         
        // 5,6
      //  System.out.println(Math.max(5, 6));
        //System.out.println(Math.min(5, 6));
       // System.out.println(Math.random());  print random value
        //System.out.println((int)(Math.random()*100));
        
        //how to take input?
        Scanner  sc = new Scanner(System.in);
        //System.out.println("input your age");
        //int age = sc.nextInt();
         //float age = sc.nextFloat();
        //System.out.println(age);
        System.out.println("input your name");
       // String name = sc.next();
         String name = sc.nextLine(); // multi line
        System.out.println(name);
    
        //comparison operator
        
        //a == b
        //a != b
        //a < b
        //a > b
        //a <= b
        //a >= b
        
        */
//        boolean isSunUp = true;  // day
//        if(isSunUp == true)
//            System.out.println("day");
//        else
//            System.out.println("night");
//                
//        
//        int age = 30;
//        if(age>18)
//            System.out.println(" vote");
//        else
//            System.out.println("can't vote");
//        
        //logical operator
        
        //&& and
       // int a = 30;
       //int b = 40;
        //int b = 60; //output not shown
       // if(a<50 && b<50)
         //   System.out.println("both less than 50");
        
        
        // or
       // if(a<50 || b<60)
         //   System.out.println("at least one less than 50");
        
        // not !
        
        //boolean isAdult = true; //is adult
      //  boolean isAdult = false; //not adult
      
       // if(isAdult == true)
       
//       boolean isAdult = false;
//       if(!isAdult)  // first true and after convert! not false so is adult 
//            System.out.println("is adult");
//        else
//            System.out.println("not aadult");
        
      
// conditional statement

//  Scanner sc = new Scanner(System.in);
//  int cash = sc.nextInt();
//  if(cash<10){
//   System.out.println("cannot buy anythings");
//   System.out.println("get more cash");
//    }
//  else if (cash>10 && cash <50){
//      System.out.println("can get 1 thing");
//      
//  } 
//  else{
//      System.out.println("can get both");
//  }
//        int day = 1; //1- monday; 2- tuesday
//         switch(day){
//             
//             case 1:
//                 System.out.println("monday");
//                 
//             case 2:
//                 System.out.println(" tuesday");
//                 break;
//                 
//             default:
//                 System.out.println("wed-sun");
            
      //  }
      
      //loops
      
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        
     //1-100  for loop
     
     // for(int i = 1; i <= 100; i++)
//      for(int i = 100; i >= 1; i--)   //100-1
//      
//      {
//          
//          System.out.println(i);


           //while loop
           
//           int i = 100;
//           while(i>=1){
//               System.out.println(i);
//               i=i-1;
//           }
  
//do while
//int i = 100;
//           do{
//             System.out.println(i);
//              i=i-1;
//
//           }while(i>=1);


//  Scanner sc = new Scanner(System.in);
//     int number = 0;
//  do{
//      System.out.println("input a number");
//   number = sc.nextInt();
//      System.out.println("here is your number");
//      System.out.println(number);
     
//  } while(number >= 0);
 
//         System.out.println("the end");

   


     int i ,j;
     for(i = 1 ; i<=5; i++){
         {
          for(j= 1; j <=i; j++ ){
            System.out.println("*");
  

          }
          System.out.println("\n");
         }
       
     }
 }

 }
