package virtualpetsamok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat oCatTest = new OrganicCat("","",0,0);
	
	@Test
	public void catCanGoPoop() {
		int litterBoxCleanlinessBefore = oCatTest.getLitterBoxCleanlinessLevel();
		oCatTest.poopInLitterBox(2);
		int litterBoxCleanlinessAfter = oCatTest.getLitterBoxCleanlinessLevel();
		assertThat(litterBoxCleanlinessBefore - litterBoxCleanlinessAfter, is(2));
		
	}
	
	@Test
	public void canCleanLitterBox() {
		int litterBoxCleanlinessBeforeCleaning = oCatTest.getLitterBoxCleanlinessLevel();
		oCatTest.cleanLitterBox(2);
		int litterBoxCleanlinessAfterCleaning = oCatTest.getLitterBoxCleanlinessLevel();
		assertThat(litterBoxCleanlinessAfterCleaning - litterBoxCleanlinessBeforeCleaning,is(2));
	}

}
