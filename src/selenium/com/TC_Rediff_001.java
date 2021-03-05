package selenium.com;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Rediff_001 {
	public static void main(String[] args) throws InterruptedException {
		//preconditions
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		//1.open the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//2.go to the URL ---> "https://www.rediff.com/"
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		
		//3.click on create account link  
		driver.findElement(By.linkText("Create Account")).click();
		
		//4.check if the page is navigated to registration page
		String input="register";
		String url=driver.getCurrentUrl();
		if(url.contains(input))
			System.out.println("The page is navigated to registration page");
		else
			System.out.println("The page is not navigated to registration page");
			
		//5.enter full name as Kim Smith
		driver.findElement(By.xpath("//*[starts-with(@name,'name')][@maxlength='61']")).sendKeys("Kim Smith");
		
		//6.enter the email id as test@test.com
		driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("test@test.com");
		
		//7.click on check availblity button
		driver.findElement(By.xpath("//*[@value='Check availability']")).click();
		
		//8.select dob: 15 aug 1992
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]/option[@value='15']")).click();
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]/option[@value='08']")).click();
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]/option[@value='1992']")).click();
		
		//9.select the gender as female
		driver.findElement(By.xpath("//*[starts-with(@name,'gender')][@value='f']")).click();
		
		//10.check if default value is India
		String Defaults="India";
		String text=driver.findElement(By.xpath("//*[@id='country']/option[@label='India']")).getText();
		if(text.equals(Defaults))
			System.out.println("YES,default value is India");
		else
			System.out.println("NO,default value is India");
		
		//11.select the city as Bangalore
		driver.findElement(By.xpath("//*[starts-with(@name,'city')]/option[@label='Bangalore']")).click();
		}
}