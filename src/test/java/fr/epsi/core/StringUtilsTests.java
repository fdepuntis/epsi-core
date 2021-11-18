package fr.epsi.core;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTests {

	@Test
	void test() {

	}

	@ParameterizedTest
	@ValueSource(strings = { "ete", "a but tuba" }) // Le test sera lancé 6 fois

	void isPalindrome(String sentense) {
		assertTrue(StringUtils.isPalindrome(sentense));

	}

}
