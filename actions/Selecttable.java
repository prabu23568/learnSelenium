package week1.day1;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;








import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecttable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(23));
		
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		
		WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).click(ele1).click(ele5).perform() ;
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		driver.quit();
			
}
	
}