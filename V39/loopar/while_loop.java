package loopar;
import java.util.Scanner;

// Jämför före iteration
public class while_loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Används när man inte vet hur många gånger man vill repetera något
		
		boolean exit = false;
		
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
	}

}