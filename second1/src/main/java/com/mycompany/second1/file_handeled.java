/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;
import java.io.*;
/**
 *
 * @author Admin
 */
//file is created
//public class file_handeled {
//    public static void main(String[] args) 
//    {
//         File f = new File("E:\\lc.txt");
//         try
//         {
//         if(f.createNewFile())
//         {
//             System.out.println("file is created");
//         }
//        else
//         {
//             System.out.println("file is already created");
//         }
//    }
//    
//         catch(IOException i){
//             System.out.println("Exception Hndled..");
//         }
//   
//    
//             } 
//}

//public class file_handeled {
//    public static void main(String[] args) throws IOException 
//    {
//         File f = new File("E:\\lc.txt");
//        
//         if(f.createNewFile())
//         {
//             System.out.println("file is created");
//         }
//        else
//         {
//             System.out.println("file is already created");
//         }
//    
//    
//    
//             } 
//}

//write on file

//class file_handeled{
//    public static void main(String[] args) {
//        try
//        {
//            FileWriter f = new FileWriter("E://lc.txt");
//            
//            try
//            {
//                f.write("java programm is best");
//            }
//            finally
//            {
//                f.close();
//            }
//            System.out.println("date is wrote");
//        }
//        catch(IOException i)
//        {
//            System.out.println(i);
//        }
//    }
//} 

//class file_handeled{
//    public static void main(String[] args) {
//        try
//        {
//            try
//            (FileWriter f = new FileWriter("E://lc.txt")) {
//                f.write("java programm is best");
//            }
//            System.out.println("date is wrote");
//        }
//        catch(IOException i)
//        {
//            System.out.println(i);
//        }
//    }
//} 
//buffered writer// fileoutputstream// pritanwriter clssses  lesson

//filereader

//class file_handeled
//{
//    public static void main(String[] args) {
//        try
//        {
//            FileReader r = new FileReader("E://lc.txt");
//            try
//            {
//               
//                int i;
//                while((i = r.read())!=-1)
//                {
//                    System.out.print((char)i);
//                }
//            }
//            finally
//            {
//                r.close();
//                System.out.print("file is closed");
//            }
//           
//        }
//        catch(IOException e)
//        {
//            System.out.println("exception handled");
//        }
//    }
//} 


//class file_handeled
//{
//    public static void main(String[] args)  throws IOException {
//       
//            FileReader r = new FileReader("E://lc.txt");
//            
//               
//                int i;
//                while((i = r.read())!=-1)
//                {
//                    System.out.print((char)i);
//                }
//            
//    }     
// 
//} 

//bufferreader scanner class fileinputstream class lesson