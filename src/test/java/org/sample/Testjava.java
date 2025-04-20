package org.sample;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testjava {
	
	//need to write test cases here
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
		
		
		
	}

}
