
public class PossibleSantas {

	String[] suspects;

	int nextIndex = 0;
	int arraySize = 0;

	public PossibleSantas(int size) {
		this.arraySize = size;
		this.suspects = new String[size];
	}

	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}
	}

	public void printSuspects() {
		for (int i = 0; i < this.suspects.length; i++) {
			if (null == this.suspects[i])
				continue;
			
			System.out.println(this.suspects[i]);
		}
	}

	public boolean foundMatch(String query) {
		for (int x = 0; x < this.suspects.length; x++) {
			if (null == this.suspects[x])
				continue;

			if (this.suspects[x].equalsIgnoreCase(query)) {
				return true;
			}
		}
		return false;
	}

}
