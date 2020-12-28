
public class FindSanta {

	public static void main(String[] args) {
		
		PossibleSantas susList = new PossibleSantas(5);
		
		susList.addSuspect("Rick");
		susList.addSuspect("Beth");
		susList.addSuspect("Morty");
		susList.addSuspect("Jerry");
		susList.addSuspect("Summer");
		
		susList.printSuspects();
	}
	
	
}
