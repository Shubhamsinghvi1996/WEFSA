package WebDrivers;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BC {
	@Test

	public void script1()
{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver command = new ChromeDriver();
		
		command.get("http://leafground.com/");

		//Navigate Command
		
		command.navigate().back();
		command.navigate().forward();
		command.navigate().refresh();
//		command.navigate().to("https://www.google.com/");
		
		command.manage().window().maximize();
		
		Dimension dim = new Dimension(250,350);
		command.manage().window().setSize(dim);
		
		//Get
		
		String title = command.getTitle();
		System.out.println(title);
		
		
		String URL = command.getCurrentUrl();
		System.out.println(URL);
		
		String Scode = command.getPageSource();
		System.out.println(Scode);

		command.quit();		
}
}
