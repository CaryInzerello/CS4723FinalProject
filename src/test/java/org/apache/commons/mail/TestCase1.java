package org.apache.commons.mail;

import junit.framework.TestCase;
import org.junit.Test;

public class TestCase1 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	@Test
	public void testAddCc() {
		System.out.println("This test class tests the AddCc() function. mjy___");
		// tests one parameter call
		try {
			testEmail.addCc("a@b.com");
		} catch (EmailException e) {
			fail();
		}
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}

}
