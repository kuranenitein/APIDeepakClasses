package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC1_PostMethod {
	
	@Test
	public void postMethodTest () throws IOException
    {
    	
		Properties pr = PropertiesHandle.loadProperties("../Practice_Framework_API/Uri.properties");
		
    	HTTPMethods hm = new HTTPMethods(pr);
    	
    	String requestBody = JsonHandle.readJson("../Practice_Framework_API/src/test/java/org/testing/resources/requestBody.json");
    	
    	hm.postMethod("QA_URI", requestBody);
    	
    	System.out.println("TC1 Executed");	
    	
	
    }
	

}
