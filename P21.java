/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i, j, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        a = input.nextInt();
        k=1;
        for(i=a; i>=1;i--){
            for(j=1; j<=i;j++){
                System.out.print(" ");
            }
            if(i==a || i==a-1 || i==1){   
                for(j=i;j<=a;j++){
                    System.out.print(j);
                }  
            }else{
                System.out.print(i);

                for(j=0;j<k;j++){
                    System.out.print(" ");
                }
                k++;
                System.out.print(a);
            }
        System.out.println("");
        }    
    }
    
}
