package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.PbaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends PbaseClass{
	
	
	
	
	@Before(order=1)
	public void configChrome() {
		
		System.out.println("Hooks Before Executed");
		launchChrome();
		loadUrl("https://www.freightcenter.com/");
		winMax();

	}
	
	@Before(order=2)
	public void startTime() {
    System.out.println(new Date());
	}
	
	@After(order=2)
	public void afterEachScenario(Scenario s) throws IOException {
		
		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");

		}
		
		closeChrome();
		System.out.println("Hooks After Executed");
	}

	@After(order=1)
	public void endTime() {
     System.out.println(new Date());
	}
	
}
