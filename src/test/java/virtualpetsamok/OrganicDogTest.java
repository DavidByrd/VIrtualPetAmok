package virtualpetsamok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog oDogTest = new OrganicDog("","",0,0);

	@Test
	public void dogCanBeWalked() {
		int dogHappinessBeforeWalk = oDogTest.getHappinessLevel();
		oDogTest.walkDog(5);
		int dogHappinessAfterWalk = oDogTest.getHappinessLevel();
		assertThat(dogHappinessAfterWalk - dogHappinessBeforeWalk, is(5));

	}

	@Test
	public void dogCanGoPoop() {
		int cageCleanlinessBeforePoop = oDogTest.getCageCleanlinessLevel();
		oDogTest.poopInCage(2);
		int cageCleanlinessAfterPoop = oDogTest.getCageCleanlinessLevel();
		assertThat(cageCleanlinessBeforePoop - cageCleanlinessAfterPoop, is(2));

	}

	@Test
	public void canTheDogCageBeCleaned() {
		int cageCleanlinessBeforeCleaning = oDogTest.getCageCleanlinessLevel();
		oDogTest.cleanCage(2);
		int cageCleanlinessAfterCleaning = oDogTest.getCageCleanlinessLevel();
		assertThat(cageCleanlinessAfterCleaning - cageCleanlinessBeforeCleaning, is(2));

	}

}
