///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.second1;
//
///**
// *
// * @author Admin
// */
//
////by extending thread class
////class A extends Thread 
////{
////  
////    @Override
////    public void run()
////    {
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("gautam");
////        }
////    }
////}
////public class thread 
////{
////    public static void main(String[] args) {
////        A t = new A();
////        t.start();
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("Gautam");
////        }
////        
////    }
////    
////}
//
////class A extends Thread 
////{
////  
////    @Override
////    public void run()
////    {
////        try
////        {
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("gautam");
////            Thread.sleep(1000);
////        }
////        }
////        catch(InterruptedException i)
////        {
////            
////        }
////        }
////    
////}
////public class thread 
////{
////    public static void main(String[] args) throws InterruptedException {
////        A t = new A();
////        t.start();
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("Gautam");
////            Thread.sleep(1000);
////        }
////        
////    }
////    
////}
//
////class A extends Thread 
////{
////  
////   
////    public void fun()
////    {
////        try
////        {
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("gautam");
////            Thread.sleep(1000);
////        }
////        }
////        catch(InterruptedException i)
////        {
////            
////        }
////        }
////    
////}
////public class thread 
////{
////    public static void main(String[] args) throws InterruptedException {
////        A t = new A();
////        t.fun();
////        for(int i =1;i<=5;i++)
////        {
////            System.out.println("Gautam");
////            Thread.sleep(1000);
////        }
////        
////    }
////    
////}
//
//// by implementing runble interface
//class A implements Runnable 
//{
//  
//    
//  
//    public void run()
//    {
//        
//        for(int i=1;i<=5;i++)
//        {
//            System.out.println("my child thread");
//        }
//    }
//    
//}
//public class thread 
//{
//
//    public static void main(String[] args) {
//        A r = new A();
//       Thread t = new Thread(r); 
//        t.start();
//         for(int i =1 ;i<=5;i++)
//        {
//            System.out.println("my thread");
//        }
//        
//    }
//    
//}
//
