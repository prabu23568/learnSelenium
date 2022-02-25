 package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaykaAss5 {
	public static void main(String[] args) {
		
		// neyka get url
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.nykaa.com/");
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("BRANDS"));           //mOUSEOVERCLASS
		act.moveToElement(ele).perform();

		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		
		String c = driver.getTitle();
		
		
		System.out.println(c);
		
		driver.close();
		
		driver.quit();

	}

}



