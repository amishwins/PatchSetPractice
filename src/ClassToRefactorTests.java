import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassToRefactorTests {

	private ClassToRefactor cut; 
	
	@Before
	public void setUp() throws Exception {
		cut = new ClassToRefactor();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void initialState() {
		assertTrue("Name incorrect", cut.getName().equals("Large Method"));
		assertTrue("State incorrect", cut.getState() == false);
	}
	
	@Test
	public void newNameAndStillFalse() {
		cut.setClassField("Soon to be refactored", false);
		assertTrue("Name incorrect", cut.getName().equals("Soon to be refactored"));
		assertTrue("State incorrect", cut.getState() == false);	
	}
	
	@Test
	public void emptyNameAndStillFalse() {
		cut.setClassField("", false);
		assertTrue("Name incorrect", cut.getName().equals("Large Method"));
		assertTrue("State incorrect", cut.getState() == false);				
	}

	@Test
	public void emptyNameAndNowTrue() {
		cut.setClassField("", true);
		assertTrue("State incorrect", cut.getState() == true);				
	}

	@Test
	public void setStateToTrueThenFalseButRemainsTrue() {
		cut.setClassField("", true);
		cut.setClassField("", false);
		assertTrue("State incorrect", cut.getState() == true);
	}	
	
	@Test
	public void verifyBlankFormattedReponse() {
		assertTrue("State incorrect", cut.formattedResponse().equals("Large Method hello"));
	}
	
}
