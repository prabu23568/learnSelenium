package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDROP {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				
				driver.get("http://www.leafground.com/pages/drop.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				WebElement source = driver.findElement(By.id("draggable"));
				WebElement target = driver.findElement(By.id("droppable"));
				
				
				Actions builder = new Actions(driver);
				builder.clickAndHold(source).moveToElement(target).perform();
			
				
				
				
	}

}
