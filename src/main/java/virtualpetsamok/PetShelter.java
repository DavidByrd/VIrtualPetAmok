package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
	
	Map<String, VirtualPets> virtualPets = new HashMap<>();

	public void addPet(VirtualPets pets) {
		virtualPets.put(pets.getPetName(), pets);
	}

	public Collection<VirtualPets> getAllPets() {
		
		return virtualPets.values();
	}
	
//	private Map<String, VirtualPets> underTest = new HashMap<String, VirtualPets>();
//
//	public int petsSize() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public void addPets(OrganicDog oDogTest) {
//		underTest.put(((VirtualPet) underTest).getPetName(), underTest);
//		
//	}
//
//	public VirtualPetAmok getPetByName(String petName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void addPets(OrganicCat testRobot) {
//		// TODO Auto-generated method stub
//		
//	}
	
//	Map<String,VirtualPetAmok> pets = new HashMap<>();
//
//	public void addPet(VirtualPetAmok underTest) {
//		pets.put(underTest.getPetName(), underTest);
//
//		
	//}

//	public Collection<VirtualPets> getAllPets1() {
//
//		return pets.values();
//	}
//
//	Map<String,OrganicPet> pets = new HashMap<>();
//
//	public void addPet(OrganicDog oDogTest) {
//		pets.put(oDogTest.getPetName(), oDogTest);
//
//		
//	}
//
//	public Collection<VirtualPets> getAllPets() {
//
//		return pets.values();
//	}

		
	

}
