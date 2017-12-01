package a3p6;

import java.util.Scanner;
/**
 *
 * @author shaikat
 */
public class A3P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
 
        int a[] = new int[n];
        int i , num, e =0,index= -1;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
         System.out.println("Enter the search number");
         num = input.nextInt();
         for( i=0;i<a.length;i++){
             if(a[i]==num)
             {
                 e = 1;
                 index = i;
             }
         }
        if(e == 1){
            System.out.print(num+" is found in ");
            System.out.println(index+" position");
        }
        else
        {
            System.out.println(num+" is not found");   
        }
         
    }
    
}
