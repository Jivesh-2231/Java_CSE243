package forth;

import java.util.Scanner;



public class Prime_Check {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int prime_count = 0;
		
		
		System.out.println("Enter Range to check Prime");
		int srange = scanner.nextInt();
		int erange = scanner.nextInt();
		
		
		
		for (int i = srange ; i < erange ; i++) {
			int count = 0;
			
			for (int j = 2 ; j <= i/2 ; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				prime_count++;
			}
		}
		
		int Prime[] = new int[prime_count];
		int index = 0;
		
		for (int i = srange ; i < erange ; i++) {
			int count = 0;
			
			for (int j = 2 ; j <= i/2 ; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				Prime[index] = i;
				index++;
			}
		}
		
		System.out.println("The array generated : ");
		for (int k = 0 ; k < index ; k++) {
			System.out.println(Prime[k]);
		}
	}

}


