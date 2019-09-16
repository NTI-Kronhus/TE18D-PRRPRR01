package lektion;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int tal1, tal2, tal3, tal4, tal5;
		int highest, lowest; // högsta resp lägsta talet
		double mean; // medelvärde kan vara decimaltal
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please print first Integer:");
		tal1 = input.nextInt();
		System.out.println("Please print second Integer:");
		tal2 = input.nextInt();
		System.out.println("Please print third Integer:");
		tal3 = input.nextInt();
		System.out.println("Please print fourth Integer:");
		tal4 = input.nextInt();
		System.out.println("Please print fifth Integer:");
		tal5 = input.nextInt();
		
		highest = tal1;
		lowest = tal1;
		
		// Letar efter högsta talet
		
		if(tal2 > highest) {
			highest = tal2;
		}
		
		if(tal3 > highest) {
			highest = tal3;
		}
		
		if(tal4 > highest) {
			highest = tal4;
		}
		
		if(tal5 > highest) {
			highest = tal5;
		}

		// Letar efter lägsta talet
		
		if(tal2 < lowest) {
			lowest = tal2;
		}
		
		if(tal3 < lowest) {
			lowest = tal3;
		}
		
		if(tal4 < lowest) {
			lowest = tal4;
		}
		
		if(tal5 < lowest) {
			lowest = tal5;
		}	
		
		// Beräknar medelvärde som ett decimaltal
		
		mean = (tal1 + tal2 + tal3 + tal4 + tal5) / 5.0;
		
		// Skriver ut högsta, lägsta samt medelvärde
		
		System.out.println("\nHighest number is: " + highest);
		System.out.println("Lowest number is: " + lowest);
		System.out.println("Mean value is: " + mean);
	}

}
