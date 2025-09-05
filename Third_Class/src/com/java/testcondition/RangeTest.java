package com.java.testcondition;

import java.util.Scanner;

public class RangeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Range : ");
		int srange = scanner.nextInt();
		int erange = scanner.nextInt();
		int count = 0;
	
		
		for (int i = srange; i <= erange; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("Total numbers divisible by  : "+count);
		count = 0;
		
	
		for (int i = srange; i <= erange; i++) {
			if (i % 4 == 0) {
				count++;
			}
		}
		System.out.println("Total numbers divisible by  : "+count);
		count = 0;
		
		
		for (int i = srange; i <= erange; i++) {
			if (i % 5 == 0) {
				count++;
			}
		}
		System.out.println("Total numbers divisible by  : "+count);
		count = 0;
		}
		
		
	}

