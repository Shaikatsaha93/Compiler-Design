import java.util.Scanner;

public class Lab2 {
public static void main(String[]args)
{
 System.out.println("Enter your String: ");
			Scanner sc = new Scanner(System.in);
			String st = sc.nextLine();
			String [] arraySplit = st.split(" ");
			for (String character : arraySplit)
				System.out.println(character);
 }
}