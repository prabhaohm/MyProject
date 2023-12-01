package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport  {
	public static void generateJvmReport(String jsonPath) {
    
		File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JVMReport");
		
		Configuration con = new Configuration(f, "Freight Center");
		con.addClassifications("Domain", "Travel");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser version", "103");
		con.addClassifications("Os", "Windows");
		con.addClassifications("Windows version ", "Windows 11");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
	}

}
