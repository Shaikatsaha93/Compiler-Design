package p17;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class P17 {

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
            for(j=1; j<=(i*2)-1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }    
    }
    
}
