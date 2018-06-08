package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.alacriti.demo.test.Demo1;

public class TestApp {

	@Test
	public void testM1() {
		Demo1 d = new Demo1();
		
		assertEquals(0, d.m1("ABC"), "ABC AJAY");
	}

}
