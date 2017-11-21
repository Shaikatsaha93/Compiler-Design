/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        for (i=1;i<=a;i++ )
        {
            System.out.print(i);
        }
        System.out.println("");
    }

    }
    

