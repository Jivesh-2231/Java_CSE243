import java.util.Scanner;


public class Input {
	public static void main(String abc[]) {
		int a,b;
		float c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		c =a*b;
		System.out.println(c);
	}
}