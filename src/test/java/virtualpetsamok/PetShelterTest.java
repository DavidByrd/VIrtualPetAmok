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
			oDogTest = new OrganicDog("name", "description", 0, 0);
			oCatTest = new OrganicCat("name", "description", 0, 0);
		}
		
		@Test
		public void shouldBeAbleToAddPets() {
			oDogTest = new OrganicDog("name", "description", 0, 0);
			petShelterTest.addPet(oDogTest);
			Collection<VirtualPets> check = petShelterTest.getAllPets();
			
			assertThat(check, containsInAnyOrder(oDogTest));
			
			
		}
//		
//		@Test
//		public void shouldBeAbleToAddPets() {
//			// Arrange
//			
//			// Act
//			int petCountBefore = petShelterTest.petsSize();
//			petShelterTest.addPets(oDogTest);
//			
//			// Assert
//			assertEquals(petCountBefore + 1, petShelterTest.petsSize());
//		}
//		
//		@Test
//		public void shouldBeAbleToAddDifferentKindsOfEmployees() {
//			// Arrange
//
//			// Act
//			petShelterTest.addPets(oDogTest);
//			petShelterTest.addPets(oCatTest);
//			
//			// Assert
//			assertThat(oDogTest, instanceOf(VirtualPets.class));
//			assertThat(oCatTest, instanceOf(VirtualPet.class));
//		}
//		
//		@Test
//		public void shouldBeAbleToGetEmployeesByEmpNumber() {
//			// Arrange
//			
//			// Act
//			petShelterTest.addPets(oDogTest);
//			petShelterTest.addPets(oCatTest);
//			
//			VirtualPets oDogTest = petShelterTest.getPetByName(oDogTest.getPetName());
//			VirtualPets oCatTest = petShelterTest.getPetByName(oCatTest.getPetName());
//			
//			// Assert
//			assertNotEquals(oDogTest.getPetName(), oCatTest.getPetName());
//			assertEquals(oDogTest.getPetName(), oDogTest.getPetName());
//			assertEquals(oCatTest.getPetName(), oCatTest.getPetName());
//		}
	
//	PetShelter shelter = new PetShelter();
//	
//	
////	@Test
////	public void shouldBeAbleToAddPets1() {
////		VirtualPets underTest = new VirtualPets("", "", 0, 0);
////		shelter.addPet(underTest);
////		Collection<VirtualPets> check = shelter.getAllPets();
////		
////		assertThat(check, containsInAnyOrder(underTest));
//		
//		
//		
////	}
//	@Test
//	public void shouldBeAbleToAddPets() {
//		OrganicDog oDogTest = new OrganicDog("", "", 0, 0);
//		shelter.addPet(oDogTest);
//		Collection<VirtualPets> check = shelter.getAllPets();
//		
//		assertThat(check, containsInAnyOrder(oDogTest));
//		
		
		
	


}
