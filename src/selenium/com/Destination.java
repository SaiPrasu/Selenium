package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class Destination {
public static void main(String[] args) {
			//preconditions
					System.setProperty("webdriver.chrome.driver", "F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
					
					//1.open the Browser
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					
					//2.go to the URL ---> "http://destinationqa.com/radiobuttons-html/"
					driver.get("http://destinationqa.com/radiobuttons-html/");
					
					//3.check if wednesday radio button is selected by default under radiobutton selection
					if(driver.findElement(By.xpath("//input[@checked='checked'][@name='groupName']")).isSelected()) {
						System.out.println("default wednesday is selected");
					}
					else {
						System.out.println("default values is not selected");

					}
					
					
					//4.select monday radio button
					driver.findElement(By.xpath("//input[@name='groupName'][@value='Mon']")).click();
					
					
					//5.check if red and yellow radio button are selected .if deselect red and select orange 
					if(driver.findElement(By.name("red")).isSelected()&& driver.findElement(By.name("yellow")).isSelected()) {
						
						//deselect red 
						driver.findElement(By.name("red")).click();
						//select orange 
						driver.findElement(By.name("orange")).click();
					
					}
		}
	}

