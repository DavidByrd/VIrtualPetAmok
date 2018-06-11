package virtualpetsamok;

public class VirtualPetAmok {

	private static final int DEFAULT_HAPPINESS_LEVEL = 20;
	private String name;
	private String description;
	private int happiness = DEFAULT_HAPPINESS_LEVEL;
	private int health;

	public VirtualPetAmok(String name, String description, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.happiness = happiness;
		this.health = health;
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

	public void getick() {

		
		health -= 1;
		happiness -= 1;
		
		
		System.out.println("Tick tock, tick tock,");
		System.out.println("health: " + health + " happiness: " + happiness);

}
		
	

	
		
		;
	}


