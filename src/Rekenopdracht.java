import java.util.Scanner;

public class Rekenopdracht {

	public static void main(String[] args) {
		int resultaat = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Typ een getal in: ");
		int input1 = scanner.nextInt();
		Getal getal1 = new Getal();
		getal1.getal = input1;
		
		System.out.println("Typ een tweede getal in: ");
		int input3 = scanner.nextInt();

		System.out.println("Kies + of -:");
		String input2 = scanner.next();
		
		if ( input2.contentEquals("+")) {
		resultaat = input1 + input3;
		}
		else if ( input2.contentEquals("-")) {
		resultaat = input1 - input3;
		}
		
		System.out.println("Dus als " + input1 + input2 + input3 + ", dan " + resultaat );
	
	}
}
	
class Getal {
	int getal;
}
	



