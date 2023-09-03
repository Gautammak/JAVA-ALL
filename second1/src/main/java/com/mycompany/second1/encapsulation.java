///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.second1;
//import java.util.Scanner;
//
///**
// *
// * @author Admin
// */
//// class Bank {
////    
////    
////    private double bal = 10;
////    private int pwd;
////    
////    public void Deposite(double money){
////        System.out.println("enter password");
////        Scanner  s = new Scanner(System.in);
////        pwd = s.nextInt();
////        //bal = s.nextInt();
////        if(pwd==123)
////        {
////            bal = bal+money;
////            System.out.println("deposite money:" + money);
////            System.out.println("total balance:"+bal);
////        }
////        
////        else
////        {
////            System.out.println("incorrect password!");
////        }
////    }
////    
////    public void Withdraw(double money){
////        System.out.println("enter password");
////        Scanner  s = new Scanner(System.in);
////        pwd = s.nextInt();
////       // bal = s.nextInt();
////        if(pwd==123)
////        {
////            bal = bal-money;
////            System.out.println("deposite money:" + money);
////            System.out.println("total balance:"+ bal);
////        }
////        
////        else
////        {
////            System.out.println("incorrect password!");
////        }
////    }
////    public void checkBal(){
////        System.out.println("enter password");
////        Scanner  s = new Scanner(System.in);
////        pwd = s.nextInt();
////      
////        if(pwd==123)
////        {
////           // bal = bal-money;
////            //System.out.println("deposite money:" + money);
////            System.out.println("total balance:"+ bal);
////        }
////        
////        else
////        {
////            System.out.println("incorrect password!");
////        }
////    }
////}
////  public class encapsulation{
////        
////        public static void main(String[] args){
////            Bank b = new Bank();
////            
////            int  ch;
////            System.out.println("1.Deposite :");
////            System.out.println("2.Withdraw :");
////            System.out.println("3.chheckBal: ");
////            
////            System.out.println("\n enter your choice:");
////            Scanner s2 = new Scanner(System.in);
////            ch = s2.nextInt();
////           
////            switch(ch)
////               
////            {
////                case 1 : b.Deposite(10);
////                break;
////                case 2 : b.Withdraw(10);
////                break;
////                case 3 : b.checkBal();
////                break;
////                default : System.out.print("invalid choice");
////            }
////            
////        }
////    }
//
//
// class Bank {
//    
//    
//    private double bal = 10;
//    private int pwd;
//    public double money;
//    
//    public void Deposite(){
//        System.out.println("enter password");
//        Scanner  s = new Scanner(System.in);
//        pwd = s.nextInt();
//        //bal = s.nextInt();
//        if(pwd==123)
//        {   
//            System.out.print("Enter deposite money:");
//            money = s.nextDouble();
//            bal = bal+money;
//            System.out.println("deposite money:" + money);
//            System.out.println("total balance:"+bal);
//        }
//        
//        else
//        {
//            System.out.println("incorrect password!");
//        }
//    }
//    
//    public void Withdraw(){
//        System.out.println("enter password");
//        Scanner  s = new Scanner(System.in);
//        pwd = s.nextInt();
//       // bal = s.nextInt();
//        if(pwd==123)
//        {
//            System.out.print("Enter Withdraw money:");
//            money = s.nextDouble();
//            bal = bal-money;
//            System.out.println("deposite money:" + money);
//            System.out.println("total balance:"+ bal);
//        }
//        
//        else
//        {
//            System.out.println("incorrect password!");
//        }
//    }
//    public void checkBal(){
//        System.out.println("enter password");
//        Scanner  s = new Scanner(System.in);
//        pwd = s.nextInt();
//      
//        if(pwd==123)
//        {
//           // bal = bal-money;
//            //System.out.println("deposite money:" + money);
//            System.out.println("total balance:"+ bal);
//        }
//        
//        else
//        {
//            System.out.println("incorrect password!");
//        }
//    }
//}
//  public class encapsulation{
//        
//        public static void main(String[] args){
//            Bank b = new Bank();
//            
//            int  ch;
//            System.out.println("1.Deposite :");
//            System.out.println("2.Withdraw :");
//            System.out.println("3.chheckBal: ");
//            
//            System.out.println("\n enter your choice:");
//            Scanner s2 = new Scanner(System.in);
//            ch = s2.nextInt();
//           
//            switch(ch)
//               
//            {
//                case 1 : b.Deposite();
//                break;
//                case 2 : b.Withdraw();
//                break;
//                case 3 : b.checkBal();
//                break;
//                default : System.out.print("invalid choice");
//            }
//            
//        }
//    }
//    
//    //lesson enput value
//    
//    
//
