/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3p9;

import java.util.Scanner;

/**
 *
 * @author shaikat
 */
public class A3P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i , num,max=0,index=0,min=0;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
        min = a[0];
        for(i=0;i>a.length;i++)
        {
            if(min > a[i])
            {
                min = a[i];
                index =i;
            }
        }
        System.out.print("Mimimum number is "+min);
        System.out.println(" and position is "+index);
        
        max = a[0];
        for(i=0;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
                index = i;
            }
        }
        System.out.print("Maximum number is "+max);
        System.out.println(" and position is "+index);
    }
    
}
