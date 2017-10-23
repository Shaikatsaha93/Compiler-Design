package p5;
import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        int a , i , j , k;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    a = sc.nextInt();
    for(i=1 ; i<=a ; i++){
        System.out.println(" ");
        for(k=i ; k<a ; k++)
        System.out.print(" ");
        for(j=1 ; j<=(i*2)-1 ; j++)
        System.out.print("*");
    }
    System.out.println("");
    }
    
}
