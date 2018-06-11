package virtualpetsamok;

public class OrganicCat extends OrganicPet {

	private int litterBoxCleanlinessLevel;

	public OrganicCat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
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
