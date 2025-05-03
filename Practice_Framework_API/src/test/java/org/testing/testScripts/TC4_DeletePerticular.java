package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC4_DeletePerticular {
	
	
	public static void main(String Args[]) throws IOException
	{
		Properties pr = PropertiesHandle.loadProperties("../Practice_Framework_API/uri.properties");
		
		HTTPMethods hm = new HTTPMethods(pr);
		
		hm.deletePerticular("QA_URI", "facb");
		
		
		
		
		
		
		
	}
	
	

}
