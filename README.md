package p1;

import java.util.Scanner;

public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of stars");
    a = sc.nextInt();
    for(i=1 ; i<=a ; i++){
    System.out.print("*");
    }
    System.out.println("");
    }
    
}
