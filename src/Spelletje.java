import java.util.Scanner;

public class Spelletje {

	public static void main(String[] args) {
		int papier1 = 1;
		int schaar2 = 2;
		int steen3 = 3;
		
		System.out.println("Kies papier (1), schaar (2) of steen (3) en typ een van de getallen in (1, 2 of 3):");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		double computer = Math.random();
		System.out.println( computer );
		if( computer < .334) {
			computer = 1;
		}
		else if ( computer < .667) {
			computer = 2;
		}
		else {
			computer = 3;
		}
		
		if( input == computer ) {
			System.out.println("Niemand wint.");
		}
		else if ( input != computer ) {
			System.out.println("Iemand wint.");

		}
		else {
			
		}
		

	}

}
