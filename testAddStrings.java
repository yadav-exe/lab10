package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new 
		jUnitFunctions();
			String result = junit.AddStrings("Aditya", "Yadav");
			assertEquals("AdityaYadav", result);
	}

}
