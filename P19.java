/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p19;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a , b, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the colams: ");
        a = input.nextInt();
        System.out.println("Enter the rows: ");
        b = input.nextInt();
        for(i=1;i<=b;i++){
            if(i==1 || i==b){
                for(j=1;j<=a;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1;j<=a-2;j++){
                    System.out.print(" ");
                }
                System.out.print(a);
            }      
            System.out.println("");
        }
    }
    
}
