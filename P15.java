package p15;

import java.util.Scanner;

/**
 *
 * @author shaikat
 */
public class P15 {

    public static void main(String[] args) {
        int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        a = input.nextInt();
        for(i=a; i>=1;i--){
            for(j=1; j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=a;j++){
                System.out.print(j);
            }
        System.out.println("");
        }    
    }
    
}
