package a3p9;
import java.util.Scanner;
public class A3P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
        int a[] = new int[n];
        int i , num,index=0;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
        int min = a[0];
        for(i=0;i<a.length;i++)
        {
            if(min > a[i])
            {
                min = a[i];
                index = i;
            }
        }
        System.out.print("Mimimum number is "+min);
        System.out.println(" and position is "+index);
        
       int max = a[0];
        for(i=0;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
                index = i;
            }
        }
        System.out.print("Maximum number is "+max);
        System.out.println(" and position is "+index);
    }
    
}
