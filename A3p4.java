package a3p4;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class A3p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i;
        int count=0;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
         for( i=0;i<a.length;i++){
        if(a[i]<10){
         count++;
          }
         }
         System.out.print("there are " +count);
         System.out.println(" numbers less than 10");
    }
    
}
