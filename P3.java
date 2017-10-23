package p3;

import java.util.Scanner;

public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i , j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    a = sc.nextInt();
    for(i=1 ; i<=a ; i++){
        System.out.println("");
        for(j=1 ; j<=i ; j++){
    System.out.print("*");
        }
    }
    System.out.println("");
    }
    
}
