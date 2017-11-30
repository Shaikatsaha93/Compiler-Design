/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p22;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        a = input.nextInt();
        for(i=1; i<=a;i++){
            for(j=a; j>=i;j--){
                System.out.print(" ");
            }
            if(i==1 || i==a){
                for(j=1; j<=(i*2)-1;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1;j<=(i*2)-3;j++){
                    System.out.print(" ");
                }
                System.out.print(j+1);
            }
            System.out.println("");
        }    
    }
    
}
