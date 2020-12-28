import java.util.Scanner;

public class FindSanta {

	public static void main(String[] args) {
		
		PossibleSantas susList = new PossibleSantas(10);
		
		susList.addSuspect("Rick");
		susList.addSuspect("Beth");
		susList.addSuspect("Morty");
		susList.addSuspect("Jerry");
		susList.addSuspect("Summer");
		
		susList.addSuspect("Birdperson");
		susList.addSuspect("Scary Terry");
		susList.addSuspect("Nancy");
		susList.addSuspect("Elon Tusk");
		susList.addSuspect("Ethan");
		
		//susList.printSuspects();
		
		System.out.println("Enter a name to search for: ");
		Scanner scan = new Scanner(System.in);
		String query = scan.nextLine();
		
		boolean foundMatch = susList.foundMatch(query);
		if(foundMatch) {
			System.out.println(query + ": is INDEED a Santa Suspect.");
		} else {
			System.out.println(query + ": is NOT a Santa Suspect.");
		}
	}
	
	
}
