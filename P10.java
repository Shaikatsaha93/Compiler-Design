/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i ,j; 
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    a = sc.nextInt();
 
       for(i=1; i<=a;i++){
            for(j=a; j>=i;j--){
                System.out.print(" ");
            }
            if(i==1 || i==a ){
                for(j=1; j<=(i*2)-1;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(j=1; j<(i*2)-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }    

    }
    
}
