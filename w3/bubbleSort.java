import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		boolean swapped;
		int temp;
		int intervsller;
		int tal; 
		int iteratoner = 0;
		
		
		System.out.println("antl tal");
		tal = input.nextInt();
		
		intervsller = input.nextInt()+1;
		
		System.out.println("antal intervaller");
		int[] numbers = new int[tal];
		
		
		
		for (int i = 0; i < numbers.length; i++) { //slumpar 37 heltal mellan 0-1000
			numbers[i] = (int) (Math.random()*intervsller);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {

			swapped = false; // nollställer swapped i början på jämförelsen
			
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
				}
				iteratoner ++ ;
				
				
			}
		} while (swapped);
		int svar = iteratoner*(tal-1);
		System.out.println(Arrays.toString(numbers));
		System.out.println("antal Iterstioner" + svar);

	}
}
