package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("http:en-gb.facebook.com//");
		// Step 4: Maximise the window
		driver.manage().window().maximize();	
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		// Step 6: Click on Create New Account button
	     driver.findElement (By.xpath("//a[text() = 'Create New Account']")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramalakshmi");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Adhavan");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7092442297");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Facebook");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select dropdown = new Select(day);
		dropdown.selectByValue("12");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropdown1 = new Select(month);
		dropdown1.selectByIndex(4);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropdown2 = new Select(year);
		dropdown2.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
