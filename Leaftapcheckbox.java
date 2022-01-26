package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//div[text()='Java']/input")).click();
       driver.findElement(By.xpath("//div[text()='C']/input")).click();
      
       driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
       driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
       driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
       driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
       driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
     
		 WebElement Selenium  = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
		 boolean Seleniumselected=Selenium.isSelected();
		 System.out.println(Seleniumselected);
		 WebElement FirstElement = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input"));
	
      	 
	}

}



