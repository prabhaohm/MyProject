package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\failed.txt",glue="org.stepdefinition",dryRun=false,snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\Report",
		"junit:target\\Report\\freight.xml",
		"json:target\\Report\\login.json",
		"rerun:src\\test\\resources\\Rerun\\failed.txt"})

public class TestReRunnerClass extends JVMReport {
	
	@AfterClass
	public static void freightCenter() {
		
		generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\login.json");

	}

}
