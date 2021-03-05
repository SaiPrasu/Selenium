package selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		//preconditions
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		//1.open the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//2.go to the URL ---> "https://ebay.com/"
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//3.Search for automation testing
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		
		//4.fetch all the suggestions 
		List<WebElement> lists = driver.findElements(By.className("UUbT9"));
		for(WebElement list:lists)
		    System.out.println(list.getText());
		
		}
}

