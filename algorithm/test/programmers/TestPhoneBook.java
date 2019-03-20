package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPhoneBook {
	private static final Logger logger = LoggerFactory.getLogger(TestPhoneBook.class);
	private PhoneBook phoneBook;

	@BeforeEach
	void setUp() {
		phoneBook = new PhoneBook();
	}

	@Test
	void testCase1() {
		assertFalse(phoneBook.solution(new String[]{"12232332", "12", "222222"}));
	}

	@Test
	void testCase2() {
		assertFalse(phoneBook.solution(new String[]{"911", "97625999", "91125426"}));
	}

	@Test
	void testCase3() {
		assertTrue(phoneBook.solution(new String[]{"113", "12340", "123440", "12345", "98346"}));
	}

	private class PhoneBook {
		public boolean solution(String[] phoneBook) {
			for(String i : phoneBook) {
			}
			return false;
		}
	}
}
