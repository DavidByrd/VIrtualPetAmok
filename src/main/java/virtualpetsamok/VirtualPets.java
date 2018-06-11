package virtualpetsamok;

public class VirtualPets {

	private static final int DEFAULT_HAPPINESS_LEVEL = 20;
	protected String name;
	protected String description;
	protected int happiness = DEFAULT_HAPPINESS_LEVEL;
	protected int health;

	public VirtualPets(String name, String description, int health, int happiness) {
		super();
	}

	public String getPetName() {
		return name;

	}

	public String getPetDescription() {

		return description;
	}

	public int getHappiness() {

		return happiness;
	}

	public int getHealth() {

		return health;
	}
	
public void tick( ) {
		
		health -= 1;
		happiness -= 1;
		
	
		System.out.println("Tick tock, tick tock,");
		System.out.println( " Health: " + health + " happiness: " + happiness);

}
}