import java.util.ArrayList;
import java.util.Scanner;

public class arrayListIntro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Tomas"); // p� index 0
		nameList.add("Petter"); // p� index 1
		nameList.add(1, "Edvin"); // p� index 1
		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
			
		}
		
		
		
	}
	
}
