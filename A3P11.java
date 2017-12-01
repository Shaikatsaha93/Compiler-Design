package a3p11;
import java.util.Scanner;
/**
 *
 * @author shaikat
 */
public class A3P11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = input.nextInt();
        int a[] = new int[n];
        int i ,j,temp;
        
        System.out.print("Enter " +n );
        System.out.println(" number");
        for( i=0;i<a.length;i++){
        a[i] = input.nextInt();
        }
        for (i = 0; i < a.length; i++) 
        {
            for (j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (i = 0; i < a.length - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[a.length - 1]);
    }
    
    
}

