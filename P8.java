/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.util.Scanner;

/**
 *
 * @author shaikat
 */
public class P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a; 
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    a = sc.nextInt();
 
      for ( int i=1 ; i<=a ; i++ ) {
         for ( int j=1 ; j <= i ; j++ ) {
            if(i==1 || i==2 || i==a || j==1 | j==i)
              System.out.print("*");
            else 
              System.out.print(" ");
         }
         System.out.println();
      }
    }
    
}
