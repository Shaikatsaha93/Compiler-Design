package p13;
import java.util.Scanner;

/**
 *
 * @author shaikat
 */
public class P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a , b, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        a = input.nextInt();
        System.out.println("Enter the number of colams: ");
        b = input.nextInt();
        for(i=1; i<=a;i++){
            for(j=1; j<=b;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
