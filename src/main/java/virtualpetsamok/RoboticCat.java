package virtualpetsamok;

public class RoboticCat extends VirtualPets {

	public RoboticCat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
		// TODO Auto-generated constructor stub
	}

	private int rustLevel = 10;

	
		// TODO Auto-generated constructor stub
	

	public int getRustLevel() {
	
		return rustLevel ;
	}

	public void oilRoboticPet(int amount) {
		rustLevel -= amount;
		
	}
	public void RoboticTick( ) {
	
	rustLevel += 1;
	
	
	
	System.out.println("Tick tock, tick tock,");
	System.out.println("RustLevel: " + rustLevel);

}
}
