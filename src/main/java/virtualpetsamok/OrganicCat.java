package virtualpetsamok;

public class OrganicCat extends OrganicPet {

	private int litterBoxCleanlinessLevel;

	public OrganicCat(String string, String string2, int i, int j) {
		super(string2, string2, j, j);
	}

	public int getLitterBoxCleanlinessLevel() {

		return litterBoxCleanlinessLevel;
	}

	public void poopInLitterBox(int amount) {
		litterBoxCleanlinessLevel -= amount;

	}

	public void cleanLitterBox(int amount) {
		litterBoxCleanlinessLevel += amount;

	}

}
