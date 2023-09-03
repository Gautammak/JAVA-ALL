/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second1;

/**
 *
 * @author Admin
 */

interface vehical
{
    String Name = "TVS";   //public + static + final
    int Speed = 100;        //public + static + final
    
    void start();  //public + abstact
    void stop();   //public + abstact
    
    default void color()
    {
        
        System.out.println("tvs color is red");
    }
     static void speed()
     {
         System.out.println(" tvs speed is 100 km/h");
     }
 
                                                                        
}

class interface1 implements vehical{
    
    @Override
    public void start()
    {
        System.out.println("start(): insert key & press start buttor"+ Name);
     
    }
    @Override
      public void stop()
      {
          System.out.println("stop(): exit key");
      }
      
      public static void main(String[] args){
          
          interface1 c = new interface1();
          c.start(); c.stop(); c.color();
          System.out.println(Speed);
      }







}

