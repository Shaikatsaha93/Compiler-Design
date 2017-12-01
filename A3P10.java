package a3p10;
import java.util.Scanner;
/**
 *
 * @author shaikat
 */
public class A3P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
        int a[] = new int[n];
        int i , num,j;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
        System.out.println("Array before reverse:");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("\nArray after reverse:");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
}
