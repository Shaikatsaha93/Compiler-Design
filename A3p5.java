package a3p5;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class A3p5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i , num;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
         System.out.println("Enter the search number");
         num = input.nextInt();
         for( i=0;i<a.length;i++){
        if(a[i]==num){
            System.out.println(num+" is found.");
            break;
          }
        else
        {
            System.out.println(num+" is not found");
            break;
        }
         }
    }
    
}
