package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetAmokTest {
	
	OrganicDog oDogTest;
	OrganicCat oCatTest;
	
	
	
	
	VirtualPetAmok underTest = new VirtualPetAmok( "name",  "description", 20, 20);
		
		
	
	@Test
	
	public void petShouldHaveName() {
		String check = underTest.getPetName();
		assertEquals(check, "name");
		
	}
@Test
	
	public void petShouldHaveDescription() {
		String check = underTest.getPetDescription();
		assertEquals(check, "description");
		
	}

@Test

public void petShouldHaveHappiness() {
	int check = underTest.getHappiness();
	assertEquals(check, 20);
}

@Test

public void petShouldHaveHealth() {
	int check = underTest.getHealth();
	assertEquals(check, 20);
}

public void petShouldHaveTick() {
	



	
}
	
	
	

}
