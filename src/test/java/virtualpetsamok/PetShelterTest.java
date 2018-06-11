package virtualpetsamok;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
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
		petShelterTest = new PetShelter(null, null, 0, 0);
		oDogTest = new OrganicDog("name1", "description1", 0, 0);
		oCatTest = new OrganicCat("name2", "description2", 0, 0);
	}

	@Test
	public void shouldBeAbleToAddPets() {
		oDogTest = new OrganicDog("name1", "description1", 0, 0);
		petShelterTest.addPet(oDogTest);
		Collection<VirtualPets> check = petShelterTest.getAllPets();

		assertThat(check, containsInAnyOrder(oDogTest));

	}

	@Test
	public void shouldBeAbleToAddTwoDifferentPets() {
//		oDogTest = new OrganicDog("name1", "1", 1, 1);
//		oCatTest = new OrganicCat("name2", "2", 0, 0);
		petShelterTest.addPet(oDogTest);
		petShelterTest.addPet(oCatTest);
		Collection<VirtualPets> check = petShelterTest.getAllPets();
		assertEquals(2, check.size());
		assertThat(check, containsInAnyOrder(oCatTest,oDogTest));

	}
	

}
