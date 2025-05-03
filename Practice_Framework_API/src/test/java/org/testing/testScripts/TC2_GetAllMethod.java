package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC2_GetAllMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pr =  PropertiesHandle.loadProperties("../Practice_Framework_API/uri.properties");
		
		HTTPMethods hm = new HTTPMethods(pr);
		
		hm.getAllMethod("QA_URI");
		
		
		
		
		System.out.println("TC2 Executed");	

	}

}
