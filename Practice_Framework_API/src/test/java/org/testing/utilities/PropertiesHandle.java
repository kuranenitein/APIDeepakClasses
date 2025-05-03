package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {

	public static Properties loadProperties(String path) throws IOException
	{
		File f = new File (path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties pr = new Properties();
		
		pr.load(fis);
		
		return pr;
	}
	
}
