
public class Persoon {

	String naam;
	int geboortejaar;
	
	public static void main(String[] args) {
		Persoon A = new Persoon();
		A.naam = "Anna";
		A.geboortejaar = 1999;
		
		Persoon B = new Persoon();
		B.naam = "Ben";
		B.geboortejaar = 2000;
		
		System.out.println("Persoon A: " + A.naam + ", " + A.geboortejaar);
		
		System.out.println("Persoon B: " + B.naam + ", " + B.geboortejaar);

	}

}
