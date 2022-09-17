package miniProjectJava;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		int number;
		boolean isPrime=true;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Lütfen sayı giriniz");
			number=scan.nextInt();
		}
        if(number==1) {
			System.out.println("sayı asal değil");
			return;
		}
		if(number<1) {
			System.out.println("sayı geçersiz");
		}
		
		for(int i=2; i<number;i++) {
			if(number %i == 0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("sayı asaldır");
		}
		else {
			System.out.println("sayı asal değil");
		}
		
	}

}
