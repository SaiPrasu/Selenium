package selenium.com;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gmail {

		public static void main(String[] args) throws InterruptedException {
			
			//1.PreConditions
			System.setProperty("webdriver.chrome.driver","F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
			
			//2.Open Browser
			ChromeDriver driver= new ChromeDriver();
			 
			//3.Maximize the screen
			driver.manage().window().maximize();
			
			//4.go to the URL
			driver.get("https://www.google.com/gmail/about/#");
			
			//driver.navigate().to("http://fb.com");
			
			//Thread.sleep(5000);
			
			
			//driver.navigate().back();
			
			//driver.navigate().forward();
			
			//5.Get the title
			System.out.println(driver.getTitle());
			
			//6.current url
		     System.out.println(driver.getCurrentUrl());
		     
		     //7.Create account
		     
		     driver.findElement(By.linkText("Create an account")).click();
		  
			//8.Enter the email id or phone number
		     
		     WebElement id = driver.findElement(By.id("username"));
			 id.sendKeys("prasu");
			 System.out.println(id.getAttribute("value"));
			 System.out.println(id.getAttribute("type"));
			
			
			driver.close();

			

		}

	}

			
