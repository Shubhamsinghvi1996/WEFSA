package WebDrivers;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class date{

	@Test 
	
	public void date2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");


		WebDriver date = new ChromeDriver();

		date.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor JSE = (JavascriptExecutor) date;
		
		JSE.executeScript("document.getElementById('datepicker1').value='29/07/2010'");	
	} 
}