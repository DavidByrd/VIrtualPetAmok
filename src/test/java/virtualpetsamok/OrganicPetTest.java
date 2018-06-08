package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicPetTest {

	OrganicPet oPetTest = new OrganicPet(null, null, 0, 0);

	@Test
	public void petCanBeFed() {
		int hungerLevelBefore = oPetTest.getHungerLevel();
		oPetTest.feedOPet(2);
		int hungerLevelAfter = oPetTest.getHungerLevel();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(2));

	}

	@Test
	public void petCanBeHydrated() {
		int thirstLevelBefore = oPetTest.getThirstLevel();
		oPetTest.hydrateOPet(2);
		int hungerLevelAfter = oPetTest.getThirstLevel();
		assertThat(thirstLevelBefore - hungerLevelAfter, is(2));

	}

}
