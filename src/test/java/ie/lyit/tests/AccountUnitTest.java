package ie.lyit.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.bank.Account;
import ie.lyit.bank.Date;
import ie.lyit.bank.Name;


public class AccountUnitTest {
	
	Account acc1, acc2;
	
	@Before
	public void init() {
		acc1 = new Account(
				new Name("Mr", "Dane", "Campbell"), 
						"123 Over There",
						10000, 
						new Date(01,12,2020)
				);
		acc2 = new Account(
				new Name("Mr", "Dane", "Campbell"), 
						"123 Over There",
						10000, 
						new Date(01,12,2020)
				);
	}

	@Test
	public void testAccountsNotEquals() {
		assertTrue("acc1 should not equal acc2", !acc1.equals(acc2));
	}
	
	@Test
	public void testNameEquals() {
		assertTrue("Name should match", acc1.getName().toString().equals("Mr Dane Campbell"));
	}
	
	@Test
	public void testDateOpenedEquals() {
		assertTrue("Date should match", acc1.getDateOpened().toString().equals("1/12/2020"));
	}
	
	
	@Test
	public void testBalanceCorrect() {
		assertTrue("Name should equal 10000", acc1.getBalance() == 10000);
	}
	
	@Test
	public void testDepositLessThanZero() {
		
		try {
			acc1.deposit(-20);
			fail("Should not be able to deposit less than zero");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
	}
	
	@Test
	public void testWithdrawGreaterThanBalance() {
		
		try {
			acc1.withdraw(10001);
			fail("Should not be able to withdraw greater than balance");
		}
		catch(IllegalArgumentException e) {
			assertTrue("", true);
		}
	}
}
