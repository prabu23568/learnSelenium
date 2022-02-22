package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonSelnium { /// as 4
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		//// button
		
		  driver.findElement(By.id("home")); String text =
		  "TestLeaf - Selenium Playground"; String title = driver.getTitle(); if
		  (text.equals(title)) { System.out.println("Home page is Displayed"); } else {
		  System.out.println("Home page is not Displayed"); }
		 
		driver.findElement(By.linkText("Button")).click();
		

		Point location = driver.findElement(By.id("position")).getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);

		String cssvalue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssvalue);

	}



}
