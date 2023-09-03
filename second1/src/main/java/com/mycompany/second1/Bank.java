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
//
//public abstract class Bank{
//
//    
//    public String Name = "myBank";
//    public String IFSC = "myBank123";
//    
//    public void bankDetail()
//    {
//        System.out.println("Bank_Name: "+ Name + " Bank_ifsc code: "+ IFSC);
//    }
//    
//   // abstract void
//    abstract void Withdraw();
//    abstract void checkBal();
//}
//
//
//class bankService extends Bank
//{
//     private double bal = 5000;
//     private int pwd;
//     public double money;
//     
//     
//      public void Deposite()
//      {
//        System.out.println("enter password");
//        Scanner  s = new Scanner(System.in);
//        pwd = s.nextInt();
//        if(pwd==123)
//        {  
//            System.out.println("Enter Deposite money:");
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
//            
//            System.out.println("Enter Withdraw money:");
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
//            System.out.println("total balance:"+ bal);
//        }
//        
//        else
//        {
//            System.out.println("incorrect password!");
//        }
//    }
//}
//  public class abstraction{
//        
//        public static void main(String[] args){
//            bankService  b = new bankService();
//            b.bankDetail();
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
//
//
