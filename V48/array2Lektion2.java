public class array2Lektion2 {

	public static void main(String[] args) {
		
		double[] numbers = new double[20];
		double[] numbers2 = {12.2,34,-45.11231234};
		int antalA = 0;		
		String[] namn = {"Billskog Gabriel", "Bratland Petter",	"Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle", "Gustafsson Emil"};
		
		for (int i = 0; i < namn.length; i++) {
			for (int j = 0; j < namn[i].length(); j++) { // kollar bokstav för bokstav om b eller B förekommer i string-arrayen
				if (namn[i].charAt(j) == 'a' || namn[i].charAt(j) == 'A'){
					antalA++;
				}
			}

		}
		System.out.println("Antal a:n är " + antalA);
				
	}
}
