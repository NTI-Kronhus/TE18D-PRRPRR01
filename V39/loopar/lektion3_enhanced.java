package loopar;

import java.util.Scanner;

public class lektion3_enhanced {

	public static void main(String[] args) {

		int age = 0; // initierat variabel
		int replay; // variabel som styr ifall man vill spela igen eller inte
		boolean repeat = true; // styr while-loopen

		Scanner input = new Scanner(System.in);

		while (repeat) { // while-loopen k�rs tills repeat = false

			System.out.println("Hur gammal �r du?");
			age = input.nextInt();

			if (age >= 18) { // (villkor) dvs man j�mf�r i detta fal tv� heltal

				System.out.println("Du �r gammal nog att k�ra bil! Grattis din j�vel!");
				System.out.println("Bara s� du vet s� f�r du �ka moppe ocks�!");

			}

			else if (age > 14 && age < 18) {

				System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r �ka moppe!");
			}

			else { // om villkoret inte uppfylls k�rs else

				System.out.println("Tyv�rr, du f�r v�nta ett tag till!");

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
