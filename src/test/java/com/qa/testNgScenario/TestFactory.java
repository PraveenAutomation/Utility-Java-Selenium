package com.qa.testNgScenario;

import org.testng.annotations.Factory;

public class TestFactory {

	@Factory
	public Object[] factoryMethod()
	{
		return new Object[] {new PageFactoryDataProvider("K1"),new PageFactoryDataProvider("K2")};
	}

}
