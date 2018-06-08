package virtualpetsamok;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	
		PetShelter petShelterTest;
		OrganicDog oDogTest;
		OrganicCat oCatTest;
		
		@Before
		public void setUp() {
			petShelterTest = new PetShelter();
			oDogTest = new OrganicDog("1234", "Neurology", 0, 0);
			oCatTest = new OrganicCat("1235", null, 3, 0);
		}
		
		@Test
		public void shouldBeAbleToAddPets() {
			// Arrange
			
			// Act
			int petCountBefore = petShelterTest.petsSize();
			petShelterTest.addPets(oDogTest);
			
			// Assert
			assertEquals(petCountBefore + 1, petShelterTest.petsSize());
		}
		
		@Test
		public void shouldBeAbleToAddDifferentKindsOfEmployees() {
			// Arrange

			// Act
			petShelterTest.addPets(oDogTest);
			petShelterTest.addPets(oCatTest);
			
			// Assert
			assertThat(oDogTest, instanceOf(VirtualPetAmok.class));
			assertThat(oCatTest, instanceOf(VirtualPetAmok.class));
		}
		
		@Test
		public void shouldBeAbleToGetEmployeesByEmpNumber() {
			// Arrange
			
			// Act
			petShelterTest.addPets(oDogTest);
			petShelterTest.addPets(oCatTest);
			
			VirtualPetAmok oDogTest = petShelterTest.getPetByName(oDogTest.getPetName());
			VirtualPetAmok oCatTest = petShelterTest.getPetByName(oCatTest.getPetName());
			
			// Assert
			assertNotEquals(oDogTest.getPetName(), oCatTest.getPetName());
			assertEquals(oDogTest.getPetName(), oDogTest.getPetName());
			assertEquals(oCatTest.getPetName(), oCatTest.getPetName());
		}
	
//	PetShelter shelter = new PetShelter();
	
	
//	@Test
//	public void shouldBeAbleToAddPets() {
//		VirtualPetAmok underTest = new VirtualPetAmok("", "", 0, 0);
//		shelter.addPet(underTest);
//		Collection<VirtualPetAmok> check = shelter.getAllPets();
//		
//		assertThat(check, containsInAnyOrder(underTest));
//		
//		
//		
//	}
//	@Test
//	public void shouldBeAbleToAddPets() {
//		OrganicDog oDogTest = new OrganicDog("", "", 0, 0);
//		shelter.addPet(oDogTest);
//		Collection<VirtualPetAmok> check = shelter.getAllPets();
//		
//		assertThat(check, containsInAnyOrder(oDogTest));
//		
//		
//		
//	}


}
