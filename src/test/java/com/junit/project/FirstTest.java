/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.junit.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("Regression")
class FirstTest {

	@Test
	@DisplayName("My 1st JUnit 5 test Automation ! 😎")
	void myFirstTest(TestInfo testInfo) {
		TestRunner testRunner = new TestRunner();
		assertEquals(2, testRunner.add(1, 1), "1 + 1 should equal 2");
		assertEquals("My 1st JUnit 5 test Automation 123 ! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
	}

}
