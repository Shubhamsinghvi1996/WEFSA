	package WebDrivers;
	
	import java.util.List;
	
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Olist {
	
		@Test
	
		public void Mylist() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver olist = new ChromeDriver();
	
			olist.get("https://www.google.com/");
	
			olist.findElement(By.name("q")).sendKeys("Selenium");
			Thread.sleep(3000);
	
			List<WebElement> ele1 = olist.findElements(By.xpath("//ul[@role='listbox']/li"));
	
			for (WebElement webElement : ele1) {
				if(webElement.getText().trim().equals("selenium ide")) {
					webElement.click();
					break;
					
				}
				
			}
			
			Thread.sleep(3000);
			olist.quit();
		}
	}
	
	
	
