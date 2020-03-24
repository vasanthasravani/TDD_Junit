package com.epam.tdd.junit;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemovalofA {

	@Test
	public void test() {
		RemovalofA a=new RemovalofA();
		assertEquals("BCD",a.remove("ABCD"));
		assertEquals("CD",a.remove("AACD"));
		assertEquals("BCD",a.remove("BACD"));
		assertEquals("BBAA",a.remove("BBAA"));
		assertEquals("BAA",a.remove("AABAA"));
	}

}