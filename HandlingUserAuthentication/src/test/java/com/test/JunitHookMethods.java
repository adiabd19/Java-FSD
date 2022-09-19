package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitHookMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all test");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each test ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	void test1() {
		fail("First test method");
	}
	
	@Test
	void test2() {
		fail("Second test method");
	}

}