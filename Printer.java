public class Printer {
	private String setence;

	public Printer(String setence) {
		this.setence = setence;
	}

	public String getSetence() {
		System.out.println(setence);
		return setence;
	}

	public String updateSetence() {
		setence = "Hello setence!" + setence;
		System.out.println(setence);
		return setence;
	}
}
