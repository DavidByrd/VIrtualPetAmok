package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		PetShelter pets = new PetShelter(null, null, 0, 0);
		OrganicDog oganicDog1 = new OrganicDog("Cujo", " Not sure why he's frothing at the mouth like that", 0, 0);
		OrganicCat oganicCat1 = new OrganicCat("Bast", " She's pretty arrogant, acts like sh's devine or something", 0,
				0);
		RoboticDog robotDog1 = new RoboticDog("Auto-Pup", " RoboDog in disquise", 0, 0);
		RoboticCat robotCat1 = new RoboticCat("Decepti-Kitty", " Be carefull of the laser eyes!!!.", 0, 0);

		pets.addPet(oganicDog1);
		pets.addPet(oganicCat1);
		pets.addPet(robotDog1);
		pets.addPet(robotCat1);

		

		int select;

		do {
			System.out.println(
					"Welcome to VPA animal shelter, we appreciate you volunterring with us! Keep your hand and feet away from the cages at all times");
			System.out.println("\nThis is the status of your pets:\n");

			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Hunger", "Thirst", "Waste",
					"Health", "Happiness", "Rust Level");

			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", oganicDog1.getPetName(),
					oganicDog1.getHungerLevel(), oganicDog1.getThirstLevel(), oganicDog1.getCageCleanlinessLevel(),
					oganicDog1.getHealth(), oganicDog1.getHappinessLevel(), "N/A");

			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", oganicCat1.getPetName(),
					oganicCat1.getHungerLevel(), oganicCat1.getThirstLevel(), oganicCat1.getLitterBoxCleanlinessLevel(),
					oganicCat1.getHealth(), oganicCat1.getHappiness(), "N/A");
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", robotDog1.getPetName(), "N/A", "N/A",
					"N/A", robotDog1.getHealth(), robotDog1.getHappiness(), robotDog1.getRustLevel());
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", robotCat1.getPetName(), "N/A", "N/A",
					"N/A", robotCat1.getHealth(), robotCat1.getHappiness(), robotCat1.getRustLevel());
			System.out.println("\nWhat would you like to do:\n");

			System.out.println("Pick a number.");
			System.out.println("[0] Quit. ");
			System.out.println("[1] Feed the organic pets");
			System.out.println("[2] Water the organic pets");
			System.out.println("[3] Walk a dog");
			System.out.println("[4] Oil Robotic Pets");
			System.out.println("[5] Clean Dog Cage");
			System.out.println("[6] Clean LitterBox");
			select = input.nextInt();

			if (select == 0) {
				continue;

			}

			else if (select == 1) { // Feed the organic pets

				oganicDog1.feedOPet(-1);
				oganicCat1.feedOPet(-1);
				oganicDog1.hydrateOPet(+1);
				oganicCat1.hydrateOPet(+1);
				oganicDog1.poopInCage(+1);
				oganicCat1.poopInLitterBox(+1);
				System.out.println("Thanks Human!!!");

			}

			else if (select == 2) {

				oganicDog1.hydrateOPet(-1);
				oganicCat1.hydrateOPet(-1);
				oganicDog1.poopInCage(+1);
				oganicCat1.poopInLitterBox(+1);
				System.out.println("Thanks Human!!! water is necessary for all life to survive");
			}

			else if (select == 3) {

				System.out.println("Ok so you'd like to take a walk with the dogs.");

				System.out.println("Let's Go!" + oganicDog1.getPetName() + " & " + robotDog1.getPetName()
						+ " time for a walk in the park");

				oganicDog1.walkDog(0);
				robotDog1.walkDog(0);
				oganicDog1.poopInCage(-2);
				oganicDog1.feedOPet(+1);

			}

			else if (select == 4) {
				System.out.println("Let's give these Robo Pets some oil!\n");
				robotDog1.oilRoboticPet(+2);
				robotCat1.oilRoboticPet(+2);

				System.out.println("Whew...thanks! was starting to get a bit squeaky there");

			}

			else if (select == 5) {
				System.out.println("You want to clean the dog cages");

				oganicDog1.cleanCage(+3);
				System.out.println("Thanks it was starting to get messy in there");

			}

			else if (select == 6) {
				System.out.println("You want to clean the litter boxes");
				
				oganicCat1.cleanLitterBox(+3);
				System.out.println("Thanks that litterbox was starting to become unsightly");
			}

			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}

			pets.tick(oganicDog1);
			pets.tick(oganicCat1);
			
			

		} while (select != 0);

	}

}
