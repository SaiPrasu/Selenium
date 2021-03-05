package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_01 {

	public static void main(String[] args) throws InterruptedException {
		//preconditions
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		//1.open the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//2.go to the URL ---> "https://ebay.com/"
		driver.get("https://ebay.in/");
		Thread.sleep(2000);
		
		//3.click on register link  
		driver.findElement(By.linkText("Register")).click();
		
		//4.enter  first name as smith
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("smith");
		System.out.println(firstname.getAttribute("value"));
		System.out.println(firstname.getAttribute("type"));
	
		//5.enter  Last name as kim
			WebElement id1 = driver.findElement(By.id("lastname"));
			 id1.sendKeys("Kim");
			 System.out.println(id1.getAttribute("value"));
			 System.out.println(id1.getAttribute("type"));
			 
		//6.Enter the Emaild 
		
			 WebElement id2 = driver.findElement(By.id("Email"));
			 id2.sendKeys("test@test.com");
			 System.out.println(id2.getAttribute("value"));
			 System.out.println(id2.getAttribute("type"));
			 
			//7.Enter the password 
				
			 WebElement id3 = driver.findElement(By.id("password"));
			 id3.sendKeys("mercury@1");
			 System.out.println(id3.getAttribute("value"));
			 System.out.println(id3.getAttribute("type"));
			 
			//8.Enter the password 
				
			 driver.findElement(By.id("showpassword")).click();
			 
     		//9.show password
			 driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
			 
	         
}

}