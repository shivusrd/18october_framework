package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Flipkart_baselibrary


{
    public static WebDriver driver;
	
	public void getflipkarturl (String url1)
	{
		driver = new ChromeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	
	public void Teardown()
	{
		//driver.quit();
	}



}
