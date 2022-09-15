package miniProjectJava;

public class primeNumber {

	public static void main(String[] args) {
		int number = 25;
		boolean isPrime=true;
		
		
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
