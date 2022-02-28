package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fram {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver mydriver = new ChromeDriver();
	
	mydriver.manage().window().maximize();
	mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	    mydriver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
	      mydriver.switchTo().frame(0);
	
         // mydriver.manage().
	      
	      
              mydriver.findElement(By.xpath("//input")).sendKeys("prabu");
              mydriver.switchTo().frame(0);
              mydriver.findElement(By.xpath("//input[@id='a']")).click();

               mydriver.switchTo().defaultContent();
               mydriver.switchTo().frame(1);
               mydriver.findElement(By.id("animals")).click();

               mydriver.findElement(By.xpath("//option[text()='Avatar']")).
              mydriver.close();
	
	}
}
