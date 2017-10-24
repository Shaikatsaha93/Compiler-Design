
package a3p1;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class A3p1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
         for( i=0;i<a.length;i++){
        
         System.out.println("        " +a[i]);
          }
        
    }
    
}
