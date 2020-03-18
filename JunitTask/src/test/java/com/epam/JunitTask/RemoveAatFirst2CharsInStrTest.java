package com.epam.JunitTask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAatFirst2CharsInStrTest {

	RemoveAatFirst2CharsInStr removeA;
	
	@BeforeEach
	void setup() {
		removeA =new RemoveAatFirst2CharsInStr();
	}
	
		@Test
		void testAat1Pos()
		{
			String actual=removeA.remove("ABCD");
			assertEquals("BCD",actual);
		}
		
		@Test
		void testAat1and2Pos()
		{
			String actual=removeA.remove("AACD");
			assertEquals("CD",actual);
		}
		
		
		@Test
		void testAat2Pos()
		{
			String actual=removeA.remove("BACD");
			assertEquals("BCD",actual);
		}
		
		@Test
		void testAat3Pos()
		{
			String actual=removeA.remove("BBAA");
			assertEquals("BBAA",actual);
		}
		
		@Test
		void testAatRandomPos()
		{
			String actual=removeA.remove("AABAA");
			assertEquals("BAA",actual);
		}
}


