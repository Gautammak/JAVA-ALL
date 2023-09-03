/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */
  
//simple inheritance super class
//class student{
//    
//      int roll, marks;
//      String name;
//      void input()
//      {
//          System.out.println("enter roll name & marks:");
//      }
//}
//subclass
// class inheritance1  extends student {
//     
//     void disp()
//     {
//         roll=1; name="ankit"; marks =89;
//         System.out.println(roll+" " +name +" " + marks);
//     }
//     
//     public static void main(String[] marks)
//     {
//         inheritance1 r = new inheritance1();
//         r.input();
//         r.disp();
//     }
//    
//}

//class student{
//    
//     protected int roll, marks;
//      String name;
//     protected void input()
//      {
//          System.out.println("enter roll name & marks:");
//      }
//}
// class inheritance1  extends student {
//     
//     void disp()
//     {
//         roll=1; name="ankit"; marks =89;
//         System.out.println(roll+" " +name +" " + marks);
//     }
//     
//     public static void main(String[] marks)
//     {
//         inheritance1 r = new inheritance1();
//         r.input();
//         r.disp();
//     }
//    
//}

//multilevel inheritance

//class student{
//    
//      int roll, marks;
//      String name;
//      void input()
//      {
//          System.out.println("enter roll name & marks:");
//      }
//}
//
//
//class  teacher extends student
//{
//     void lesson()
//     {
//         roll=1; name="ankit"; marks =89;
//         System.out.println(roll+" " +name +" " + marks);
//     }
//    
//    
//}
// class inheritance1  extends teacher {
//     
//     void disp()
//     {
//         roll=1; name="ankit"; marks =89;
//         System.out.println(roll+" " +name +" " + marks);
//     }
//     
//     public static void main(String[] args)
//     {
//         inheritance1 r = new inheritance1();
//         r.input();
//         r.disp();
//         r.lesson();
//     }
//    
//}
//super 1
//    class A
//    {
//         int a,b,c;
//         void add()
//         {
//             a=10; b =20;
//             c=a+b;
//             System.out.println("add of two number:" +c);
//         }
//         
//         void sub()
//         {
//             a=200;b=100;
//             c=a-b;
//             System.out.println("sum of two number:" +c);
//             
//         }
//         
//         
//    }
//sub class1


//class B extends A
//{
//    
//    void mul()
//         {
//             a=200;b=150;
//             c=a*b;
//             System.out.println("mul of two number:" +c);
//             
//         }
//         void div()
//         {
//             a=250;b=100;
//             c=a/b;
//             System.out.println("div of two number:" +c);
//             
//         }
//    
//}
////subclass2 c
//class C extends B
//{
//      void rem()
//      {
//          
//             a=250;b=100;
//             c=a%b;
//             System.out.println("rem of two number:"+ c);
//             
//         
//      }
//}
//
//public class inheritance1
//{
//    
//    public static void main(String[]  args)
//    {
//         C r = new C();
//        r.add();
//        r.sub();
//        r.mul();
//        r.div();
//        r.rem();
//         
//    }
//}

//multiple inheritance
//interface A
//
//   
//    {
//         void show();  // public  + abstract
//         
//    }
//
//interface B
//{
//    void show();// public  + abstract
//    
//}
//
// class inheritance1 implements A,B
// {
//     
//     public void show()
//     {
//          System.out.println(" this is class a and b");
//     }  
//     public static void main(String[] args)
//     {
//         inheritance1 r = new inheritance1();
//         r.show();
//     }
// }
//
//

//interface A
//   
//    {
//         void show();  // public  + abstract
//         
//    }
//
//interface B
//{
//      void disp();// public  + abstract
//    
//}
//
// class inheritance1 implements A,B
// 
// {
//     @Override
//     public void show()
//     {
//          System.out.println(" interface a ");
//     }   
//     
//     @Override
//    public void disp()
//     {
//        System.out.println(" interface b");
//   }
//    public static void main(String[] args)
//     {
//         inheritance1 r = new  inheritance1();
//          r.show(); 
//         r.disp();
//     }
// }
//
//

//interface A
//   
//    {
//         void show();  // public  + abstract
//         
//    }
//
//interface B
//{
//      void show();// public  + abstract
//    
//}
//
// class inheritance1 implements A,B
// 
// {
//     @Override
//     public void show()
//     {
//          System.out.println(" interface a and b ");
//     }   
//     
//    
//    public static void main(String[] args)
//     {
//         inheritance1 r = new  inheritance1();
//          r.show(); 
//        
//     }
// }
 //herarchical inheritance



//class A
//{
//    
//    void input()
//    {
//        System.out.println(" enter your name");
//    }
//    
//}
//class B extends A
//{
//    void show()
//    {
//        System.out.println("ny name is gautam");
//    }
//    
//}
//
//class C  extends A
//{
//    void disp()
//    {
//        System.out.println("my name is pritam");
//    }
//}
//
//
//public class inheritance1 
//{
//    public static void main(String[] args)
//    {
//        B r = new B();
//        C r2 = new C();
//        r.input();
//        r.show();
//        r2.disp(); r2.input();
//    }
//}