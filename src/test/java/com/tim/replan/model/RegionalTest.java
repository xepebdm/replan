package com.tim.replan.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegionalTest {

	@Test
	public void testValidacaoRegional() {
		assertEquals("TBR", Regional.TBR.name());
	}

}
