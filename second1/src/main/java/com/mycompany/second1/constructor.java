package com.mycompany.second1;

/**
 *
 * @author Admin
 */

//constructor
// class A {
//    
//    int a; String name;
//    
//   A()
//   {
//       a = 0; name = null;
//   }
//   
//    void show()
//    {
//        System.out.print(a +" "+ name);
//    }
//} 
// public class constructor {
//       public static void main(String[] args)
//       {    
//            A  ref = new  A();
//                ref.show();
                                                             
 //       }
  //   }

//default constructor
//class A
//{
//     int a; String b;boolean c;
//     A()
//     {
//         
//         a = 100; b ="ankit"; c = true;
//     }
//     
//  void Disp()
//     {
//         System.out.println(a+" "+b+" "+c);
//     }
//}
//  public class constructor 
// {
//     
//     public static void main(String[] args)
//     {
//    A r = new A();
//     r.Disp();
//     }
//  }   

//paramiterized constructor


//class A
//{
//    int x,y;
//    A(int a , int b)
//    {
//       x=a; y=b;
//    }
//    
//  void show()
//    {
//        System.out.print(x+" "+y);
//    }
//}
//
// public class  constructor
//{
//  public static void main(String[]  args){
//          A r = new A(100,200);
//          r.show();
//}
//}


//multiple peramiter
// class A
// {
//     int x,y;
//     A(int a , int b)
//     {
//        x=a; y=b;
//     }
    
//     A(int a , String b)
//     {
//         System.out.println(a+" "+ b);
//     }
    
//   void show()
//     {
//         System.out.println(x+" "+y);
//     }
// }

//  public  class  constructor
// {
//   public static void main(String[]  args){
//           A r = new A(100,200);
//           r.show();
//          A ref = new A(10,"ankush");
// }
// }

//copy constructor using default constructo

//class A
//{
//  int  a; String b;
//  A()
//  { 
//        a= 10; b = " learning coding";
//        System.out.println(a + " "+ b);
//  }
//
//A(A ref)
//{
//     a = ref.a;
//     b = ref.b;
//     System.out.println(a + " "+ b);
//}
//}
//{
//  public static void main(String[] args){
//    A r = new A();
//
//class constructor
//    A r2 = new A(r);
//  }
//}

 //copy constructor using peramitarize constructor 
//class A
//{
//    int x , y;
//    A(int a , int b)
//    {
//        
//        x=a;
//        y=b;
//        System.out.println(x +" " + y );
//    }
//    
//    A(A ref){
//        
//        x = ref.x;
//        y = ref.y;
//        System.out.println(x+" "+ y);
//    }
//        
//}
//
//public class constructor
//{
//    public static void main(String args[]){
//        
//        A r = new A(10,20);
//        A r2 = new A(r);
//    }
//}

//private constructor

class A
{
    int a ; double b ; String c;
    private A()
    {
        a = 10; b = 30.56; c = "ankit";
        System.out.println(a+" "+b + " "+c);   
    }

        public static void main(String[] args){
           A r = new A();   
        }
}




