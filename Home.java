package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver drivr = new ChromeDriver();
	drivr.get("http://leaftaps.com/opentaps/control/main");
	drivr.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	drivr.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	drivr.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	drivr.findElement(By.linkText("CRM/SFA")).click();
	}

}
