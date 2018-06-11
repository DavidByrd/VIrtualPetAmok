package virtualpetsamok;

public class OrganicPet extends VirtualPets {

	public OrganicPet(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
		// TODO Auto-generated constructor stub
	}

	private static final int DEFAULT_HUNGER_LEVEL = 10;
	private int hungerLevel = DEFAULT_HUNGER_LEVEL;
	private int thirstLevel = 10;

	public int getHungerLevel() {

		return hungerLevel;
	}

	public void feedOPet(int amount) {
		hungerLevel -= amount;

	}

	public int getThirstLevel() {

		return thirstLevel;
	}

	public void hydrateOPet(int amount) {
		thirstLevel -= amount;

	}
public void organicTick( ) {
		
	
		
		thirstLevel += 1;
		hungerLevel =+ 1;
		System.out.println("Tick tock, tick tock,");
		System.out.println("hunger: " + hungerLevel + " thirst: " + thirstLevel + " happiness: " + happiness);

}
}
