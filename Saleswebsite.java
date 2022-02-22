package week1.day1;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Saleswebsite {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.name("UserFirstName")).sendKeys("prabu");
			driver.findElement(By.name("UserLastName")).sendKeys("r");
			driver.findElement(By.name("UserEmail")).sendKeys("prabu.ramasamy@gmail.com");
			WebElement title = driver.findElement(By.name("UserTitle"));
			
			
			Select element = new Select(title);
			element.selectByIndex(4);
			
			
			
			driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");
			WebElement employees = driver.findElement(By.name("CompanyEmployees"));
			Select element1 = new Select(employees);
			
			
			element1.selectByIndex(3);
			driver.findElement(By.name("UserPhone")).sendKeys("12334568");
			driver.close();

		}

	}


