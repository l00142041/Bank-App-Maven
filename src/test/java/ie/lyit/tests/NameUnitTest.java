package ie.lyit.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.bank.Name;

public class NameUnitTest {

	Name n1, n2, n3;
	
	@Before
	public void init() {
		n1 = new Name("Mr", "Dane", "Campbell");
		n2 = new Name("Mr", "Dane", "Campbell");
		n3 = new Name("Miss", "Mary", "Wimms");
	}

	@Test
	public void testNameEquals() {
		assertTrue("n1 should equal n2", n1.equals(n2));
	}
	
	@Test
	public void testIsNotFemale() {
		assertTrue("n1 should be male", !n1.isFemale());
	}
	
	@Test
	public void testIsFemale() {
		assertTrue("n3 should be female", n3.isFemale());
	}

}
