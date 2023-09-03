/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr_prac_2;

/**
 *
 * @author Admin
 */
public class PR_PRAC_2 {

   static void Minkowski_Distance(int[] arr1, int[] arr2)
   {
       float ans2 = 0;
       int p = 3;
       int[] distance = new int[arr1.length];
       for(int i = 0;i<arr1.length; i++)
       {
           distance[i] = Math.abs(arr1[i]-arr2[i]);
           distance[i] = (int) Math.pow(distance[i],p);
       }
         for(int j=0; j<arr1.length;j++){
             ans2+=distance[j];
             
    }
        ans2 =(float) Math.pow(ans2,(0.33));
       System.out.println("Minkowski Distance is: "+ans2);            
         
   }    
   static void Manhattan_Distance(int[] arr1,int[] arr2){
       int ans1 = 0;
       int[] distance = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
             distance[i] = Math.abs(arr1[i]-arr2[i]);         
        }
        for(int i = 0 ;i<arr1.length;i++)
        {
            ans1+=distance[i];
        }
        System.out.println("Mahatan Distance is: " +ans1);
                
   }
   
   
   static void Euclidian_Distance(int[] arr1 , int[] arr2){
       int[] distance = new int[arr1.length];
       float ans = 0;
       
       for(int i=0;i<arr1.length;i++){
           distance[i] = Math.abs(arr1[i]-arr2[i]);
            distance[i] =  distance[i]* distance[i];
                    
       }
       
       for(int j=0;j<arr1.length;j++){
           ans+=distance[j];
       }
        ans = (float) (Math.sqrt(ans));
       System.out.println("Euclidiuan Distance is "+ans);

   }
   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1  = {19,1,42,10};
        
        int[] arr2 = {20,0,36,8};
        Euclidian_Distance(arr1,arr2);
        Manhattan_Distance(arr1,arr2);
        Minkowski_Distance(arr1,arr2);
        // TODO code application logic here
    }
    
}
    

