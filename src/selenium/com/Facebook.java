package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebook {

		public static void main(String[] args) {
			//1.PreConditions
					System.setProperty("webdriver.chrome.driver","F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
					
					//2.Open Browser
					ChromeDriver driver= new ChromeDriver();
					 
					//3.Maximize the screen
					//driver.manage().window().maximize();
					
					//4.go to the URL
					driver.get("https://fb.com");
					
					//5.Get the title
					System.out.println(driver.getTitle());
					
					//6.current url
					System.out.println(driver.getCurrentUrl());
					
					//7.Enter the email id or phone number
					driver.findElement(By.id("email")).sendKeys("7013263887");
					driver.findElement(By.className("inputtext")).sendKeys("p@gmail.com");
					
					System.out.println(driver.findElement(By.className("inputtext")).getAttribute("value"));
					
					System.out.println(driver.findElement(By.className("inputtext")).getAttribute("Type"));
	
	
					//8.Enter the password     
					driver.findElement(By.name("pass")).sendKeys("password");
					//driver.findElement(By.tagName("input")).sendKeys("pwd");
					
					//9.click on the forgot password
					driver.findElementByLinkText("Forgotten password?").click();
					
					
//					//10.click on create accoun 
//					driver.findElement(By.xpath("//*[@id=\"u_0_2_VI\"]")).click();
//
//					driver.findElement(By.xpath("//*[@id=\"u_6_b_3z\"]")).sendKeys("prasu");
			  

				


		}

	}
