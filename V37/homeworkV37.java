import java.util.Scanner;

public class homeworkV37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hej! Vad heter du? ");
		String name = input.nextLine();
		System.out.println("Hur gammal �r du? ");
		String age = input.nextLine();
		System.out.println("Vilken gata bor du p�? ");
		String street = input.nextLine();
		System.out.println("Vad �r ditt postnummer? ");
		String postal = input.nextLine();
		System.out.println("Vilken stad bor du i? ");
		String city = input.nextLine();
		System.out.println("Vad �r ditt telefonnummer?");
		String phoneNumber = input.nextLine();
		System.out.println();
		
		System.out.println("Information:");
		System.out.println("Namn: " + "\t\t" + name);
		System.out.println("�lder: " + "\t\t" + age);
		System.out.println("Adress: " + "\t" + street);
		System.out.println("\t\t" + postal + " " + city);
		System.out.println("Telefon: " + "\t" + phoneNumber);



	}
}