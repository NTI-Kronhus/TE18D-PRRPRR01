package loopar;

import java.util.Scanner;

public class lektion3_enhanced {

	public static void main(String[] args) {

		int age = 0; // initierat variabel
		int replay; // variabel som styr ifall man vill spela igen eller inte
		boolean repeat = true; // styr while-loopen

		Scanner input = new Scanner(System.in);

		while (repeat) { // while-loopen körs tills repeat = false

			System.out.println("Hur gammal är du?");
			age = input.nextInt();

			if (age >= 18) { // (villkor) dvs man jämför i detta fal två heltal

				System.out.println("Du är gammal nog att köra bil! Grattis din jävel!");
				System.out.println("Bara så du vet så får du åka moppe också!");

			}

			else if (age > 14 && age < 18) {

				System.out.println("Du är för ung för att köra bil men du får åka moppe!");
			}

			else { // om villkoret inte uppfylls körs else

				System.out.println("Tyvärr, du får vänta ett tag till!");

			}

			System.out.println();
			System.out.println("Would you like to play again? \nPress '1' for yes, '2' for no");

			replay = input.nextInt();

			if (replay != 1) { // styr ifall man ska avbryta spelet
				repeat = false;
				System.out.println("\nHave a nice day!");
			}
		}
	}

}
