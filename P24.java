/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p24;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of number: ");
        a = input.nextInt();
        for(i=1;i<=a;i++){
            System.out.print(i);
        }
        for(j=a-1;j>=1;j--){
            System.out.print(j);
        }
        System.out.println("");
    }
    
}
