package org.stepdefinition;

import org.commonaction.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{

	@Before
	public void beforescenario()
	{
		launch("http://www.demo.guru99.com/telecom/");
		System.out.println("hooks file initiated");	
	}


	@After
	public void afterscenario()
	{
		System.out.println("hooks file terminated");		
	}

}
