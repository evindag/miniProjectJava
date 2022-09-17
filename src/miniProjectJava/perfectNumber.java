package miniProjectJava;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int total = 0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Lütfen sayı giriniz");
			number=scan.nextInt();
		}
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total = total +i;
			}
		}
		
		if(total == number) {
			System.out.println("Mükemmel sayıdır.");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}

}
