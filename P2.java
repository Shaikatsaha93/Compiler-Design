package p2;

import java.util.Scanner;

public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , b , i , j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    a = sc.nextInt();
    System.out.println("Enter the number of colams");
    b = sc.nextInt();
    for(i=1 ; i<=a ; i++){
        System.out.println("");
        for(j=1 ; j<=b ; j++){
    System.out.print("*");
        }
    }
    System.out.println("");
    }
    
}
