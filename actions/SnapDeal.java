package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Men's Fashion"));
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sports Shoes")).click();
		String title = driver.getTitle();
		System.out.println(title);

		
		String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);

		driver.close();

}
}