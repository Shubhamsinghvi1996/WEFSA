package WebDrivers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ttest {
	
@Test 
	
	public void screen() throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

	WebDriver simpless = new ChromeDriver();
	
	simpless.get("http://demo.automationtesting.in/Selectable.html");
	

	simpless.findElement(By.linkText("Serialize")).click();

	List<WebElement> ele1 = simpless.findElements(By.xpath("//*[@id='Serialize']/ul/li"));

	Actions act1 = new Actions(simpless);

	act1.keyDown(Keys.CONTROL)
	.click(ele1.get(0))
	.click(ele1.get(2))
	.click(ele1.get(4)) 
	.click(ele1.get(6))
	.build().perform();
	
		TakesScreenshot s1 = (TakesScreenshot) simpless;
		
		File Source= s1.getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\shubham.singhvi\\Desktop\\Screenshots\\img1.jpg");
		
		FileHandler.copy(Source, Destination);
		
	
	}
}
