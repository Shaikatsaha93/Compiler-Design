package p14;

import java.util.Scanner;

/**
 *
 * @author shaikat
 */
public class P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        a = input.nextInt();
        for(i=1; i<=a;i++)
        {
            for(j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }    
    }
    
}
