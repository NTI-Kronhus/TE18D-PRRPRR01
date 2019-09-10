package V37;

import java.util.Scanner; // behövs om man vill ha input

public class lektion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // behövs om man vill ha input
		
		String namn1 = "Tomas Weis";
		String namn2 = "Andreas Ohlsson";
		String namn3 = "Zachris Markström Stenhammar";
		
		System.out.println("Skriv ett namn: "); // skriver ut ett meddelande
		
		String namn4 = input.nextLine(); // läser in ett namn från konsolen

		System.out.println("Skriv ett namn: ");
		
		String namn5 = input.nextLine();
		
		System.out.println("\nNAMN:");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
		
		
		
	}

}
