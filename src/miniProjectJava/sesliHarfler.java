package miniProjectJava;

import java.io.IOException;
import java.util.Scanner;

public class sesliHarfler {

	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Bir sesli harf giriniz");
			char harf1 = scan.next().charAt(0); 
			
			switch(harf1) {
			case 'a':	
			case 'A':
			case 'ı':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
			case 'e':	
			case 'E':
			case 'i':
			case 'İ':
			case 'ö':
			case 'Ö':
			case 'ü':
			case 'Ü':
				System.out.println("İnce sesli harf");
				break;
				default:
					System.out.println("Geçersiz harf girdiniz.");
				
				
				
			
			}
		}
	}

}
