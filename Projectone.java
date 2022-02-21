package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.internal.DaemonThreadFactory;

public class Projectone {
	public static void main(String[] args) {
		
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tamilselvan"); //first name  



driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar"); // last name

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("96554332"); //number


// dob
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");
WebElement eledate = driver.findElement(By.id("day"));
Select date=new Select( eledate);
date.selectByVisibleText("4");


WebElement elemonth = driver.findElement(By.xpath("//select[@id='month']"));
Select month=new  Select(elemonth);
month.selectByVisibleText("May");


WebElement eleyear = driver.findElement(By.xpath("//select[@id='year']"));
Select year = new Select(elemonth);
year.selectByVisibleText("2001");


driver.findElement(By.linkText("Male")).click(); //gender

driver.findElement(By.xpath("//button[@name='websubmit']")).click();  // sign







}
}