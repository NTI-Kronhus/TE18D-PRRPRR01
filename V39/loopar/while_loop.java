package loopar;
import java.util.Scanner;

// J�mf�r f�re iteration
public class while_loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
		
		boolean exit = false;
		
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
	}

}