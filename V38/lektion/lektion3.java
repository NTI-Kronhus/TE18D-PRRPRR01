package lektion;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {

		int alder = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // g�r det m�jligt att f� input fr�n konsolen

		System.out.println("Hur gammal �r du?");
		alder = input.nextInt();

		if (alder >= 18) { // (villkor) dvs man j�mf�r i detta fal tv� heltal

			System.out.println("Du �r gammal nog att k�ra bil! Grattis din j�vel!");
			System.out.println("Bara s� du vet s� f�r du �ka moppe ocks�!");

		}

		else if (alder > 14 && alder < 18) {

			System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r �ka moppe!");
		}

		else { // om villkoret inte uppfylls k�rs else

			System.out.println("Tyv�rr, du f�r v�nta ett tag till!");

		}

	}

}
