package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_02 {
	public static void main(String[] args) {
				//preconditions
				System.setProperty("webdriver.chrome.driver", "F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
				
				//1.open the Browser
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//2.go to the URL ---> "https://www.rediff.com/"
				driver.get("https://www.rediff.com/");
				
				//3.Click on register link and wait to the page to navigate
				driver.findElement(By.linkText("Create Account")).click();
				
				//4.enter data in password field
				String pass1="password";
				driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys(pass1);
				
				//5.enter data in re-enter password field
				String pass2="password";
				driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys(pass2);
				
				//6.compare the data in password & reenter password field are same
				if(pass1.equals(pass2)) {
					System.out.println("passwords are same");
				}
				else {
					System.out.println("passwords are not same");
				}			
	}
}
