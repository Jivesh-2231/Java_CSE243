import java.util.Scanner;

public class Sum_Add {
	public int Sum(){
		int a,b;
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		return a + b;
	}
	public static void main(String[] args) {
		Sum_Add obj = new Sum_Add();
		int sum = obj.Sum();
		if (sum > 30) {
			System.out.println("sum = "+sum);
		}else {
			Sum_Add.main(args);
		}
	}	
}