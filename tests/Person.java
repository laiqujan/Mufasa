import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.easymock.EasyMock;

public class Person {

	BankAccount bankaccount;
	Transaction transaction;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Before
	public void setup() {
		bankaccount = new BankAccount("66661111", 10.0);
		// bankaccount.setCardNumber("66661111");
		// Mock create
		transaction = EasyMock.createMock(Transaction.class);
		// bankaccount.startTransaction(transaction);

	}

	@Test
	public void testBankAccountAttachement() {
		// Mock set expectations
		EasyMock.expect(transaction.getBalance("66661111")).andReturn(9.99);// setting
																			// expectation
		EasyMock.replay(transaction);// activating mock
		Customer c1 = new Customer();
		bankaccount.addCustomerAccount(c1);
		bankaccount.startTransaction(transaction, "debit");
		assertEquals(9.99, bankaccount.getTotalBalance(), 0.0);
	}

	@Test
	public void testRefundTransaction() {
		// Mock set expectations
		EasyMock.expect(transaction.getBalance("66661111")).andReturn(10.0);// setting
																			// expectation
		EasyMock.replay(transaction);// activating mock
		Customer c1 = new Customer();
		bankaccount.addCustomerAccount(c1);
		bankaccount.startTransaction(transaction, "deposit");
		assertEquals(10.0, bankaccount.getTotalBalance(), 0.0);

	}

	@Test
	public void testCustomerUserName() {
		Customer c1 = new Customer();
		c1.setUsername("hellotesting");
		assertEquals("Username is incorrect", true, c1.checkValidity(c1.getUsername(), "usename"));

	}

	@Test
	public void testCustomerPassword() {
		Customer c1 = new Customer();
		c1.setPassword("kc_ho_123");
		assertEquals("Password is incorrect", true, c1.checkValidity(c1.getPassword(), "password"));

	}

	@Test
	public void testCustomerPhonenumber() {
		Customer c1 = new Customer();
		c1.setContactNumber("4567589237");
		assertEquals("ContactNumber is incorrect", true, c1.checkValidity(c1.getContactNumber(), "contact"));

	}

	@Test
	public void testCustomerCityCode() {
		Address ad = new Address();
		ad.setCode("565-3");
		assertEquals("Postal Code is incorrect", true, ad.checkValidity(ad.getCode(), "code"));

	}

	@Test
	public void testCustomerEmail() {
		Customer c1 = new Customer();
		c1.setEmailAddress("hello123yahoo.com");
		assertEquals("Email is incorrect", true, c1.checkValidity(c1.getEmailAddress(), "email"));

	}
	@Test
	public void testCustomerCity() {
		Address ad = new Address();
		ad.setCity("Oulu");
		assertEquals("City name is incorrect", true, ad.checkValidity(ad.getCity(), "city"));

	}

	@Test
	public void testCustomerCountry() {
		Address ad = new Address();
		ad.setCountry("Finland");
		assertEquals("Country name is incorrect", true, ad.checkValidity(ad.getCountry(), "country"));

	}

}
