package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticCatTest {
	
	RoboticCat testRobot = new RoboticCat("","",0,0);
	
	@Test
	public void canRoboticPetBeOiled() {
		int rustLevelBefore = testRobot.getRustLevel();
		testRobot.oilRoboticPet(2);
		int rustLevelAfter = testRobot.getRustLevel();
		assertThat(rustLevelBefore-rustLevelAfter,is(2));
		
		
		
	}

}
