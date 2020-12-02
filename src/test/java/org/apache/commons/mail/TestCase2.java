package org.apache.commons.mail;

import junit.framework.TestCase;
import org.junit.Test;

public class TestCase2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	@Test
	public void testAddReplyTo() {
		//when just email address is given
		System.out.println("This test class tests the AddReplyTo() function. mjy___");
		try {
			testEmail.addReplyTo("a@b.com");
			assertEquals("a@b.com", testEmail.getReplyToAddresses().get(0).toString());
		} catch (EmailException e) {
			fail();
		}
	}

}
