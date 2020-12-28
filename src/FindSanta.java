import java.util.Scanner;

public class FindSanta {

	public static void main(String[] args) {
		
		PossibleSantas susList = new PossibleSantas(10);
		
		susList.addSuspect("Rick@gmail.com");
		susList.addSuspect("Beth@gmail.com");
		susList.addSuspect("Morty@gmail.com");
		susList.addSuspect("Jerry@gmail.com");
		susList.addSuspect("Summer@gmail.com");
		
		susList.addSuspect("Birdperson@gmail.com");
		susList.addSuspect("ScaryTerry@gmail.com");
		susList.addSuspect("Nancy@gmail.com");
		susList.addSuspect("ElonTusk@gmail.com");
		susList.addSuspect("Ethan@gmail.com");
		
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
