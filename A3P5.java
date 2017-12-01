/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3p5;

import java.util.Scanner;
/**
 *
 * @author shaikat
 */
public class A3P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i , num, e =0;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
         System.out.println("Enter the search number");
         num = input.nextInt();
         for( i=0;i<a.length;i++){
             if(a[i]==num)
             {
                 e = 1;
             }
         }
         
        if(e == 1){
            System.out.println(num+" is found.");
            
          }
         
        else
        {
            System.out.println(num+" is not found");
            
        }
         
    }
    
}
