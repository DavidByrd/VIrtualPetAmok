package virtualpetsamok;

public class OrganicDog extends OrganicPet implements DogWalking {

	private int happinessLevel;
	private int cageCleanlinessLevel;

	public OrganicDog(String name, String description, int health, int happiness) {
     super(name, description, health, happiness);
	}

	public int getHappinessLevel() {

		return happinessLevel;
	}

	@Override
	public void walkDog(int amount) {
		happinessLevel += amount;

	}

	public int getCageCleanlinessLevel() {

		return cageCleanlinessLevel;
	}

	public void poopInCage(int amount) {
		cageCleanlinessLevel -= amount;

	}

	public void cleanCage(int amount) {
		cageCleanlinessLevel += amount;

	}

}
