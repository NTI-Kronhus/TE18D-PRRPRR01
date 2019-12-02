package arrays;

public class array2Lektion2 {

	public static void main(String[] args) {

		double[] numbers = new double[20];
		double[] numbers2 = { 12.2, 34, -45.11231234 };
		int antalA = 0, antalB = 0;
		String[] namn = { "Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle",
				"Gustafsson Emil" };

		for (int i = 0; i < namn.length; i++) { // loopar genom stringarrayen, ett namn i taget
			for (int j = 0; j < namn[i].length(); j++) { // kollar bokstav för bokstav om b eller B
															// förekommer i ett element i string-arrayen
				if (namn[i].charAt(j) == 'b' || namn[i].charAt(j) == 'B') {
					antalA++;
				}
			}

			if (namn[i].charAt(0) == 'B') { // om efternamnet namnet börjar med B, räkna antal B:n
				antalB++;
			}

		}
		System.out.println("Antal a:n är " + antalA);
		System.out.println("Antal B:n är " + antalB);

	}
}
