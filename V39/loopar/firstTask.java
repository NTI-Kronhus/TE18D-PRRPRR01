package loopar;

public class firstTask {

	public static void main(String[] args) {

		int sum = 0; // initierar en summa
		
		for ( int i = 0 ; i < 100 ; i++) { // k�r en loop 100 g�nger (0-99)
			
			sum = sum + i; // adderar f�reg�ende summa ihop med talet i

			System.out.println(sum);
		}
		
		System.out.println(sum); // skriver ut totala summan

	}

}
