package week1.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtabe {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver mydriver = new ChromeDriver();
		
		mydriver.manage().window().maximize();
		mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		mydriver.get("http://www.leafground.com/pages/table.html");
		
		
		
	  List<WebElement> CCOUNT = mydriver.findElements(By.tagName("th"));
		
    List<WebElement> RCOUNT = mydriver.findElements(By.tagName("tr"));
		
           int csize = CCOUNT.size();   int Rsize = RCOUNT.size();
           
           System.out.println(csize);    System.out.println(Rsize);
           
		

	}

}
