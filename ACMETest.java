package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ACMETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Load url "https://acme-test.uipath.com/login"
		
//		Enter email as "kumar.testleaf@gmail.com"
//		Enter Password as "leaf@12"
//		Click login button
//		Get the title of the page and print
//		Click on Log Out
//		Close the browser (use -driver.close())
		
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();	
		Driver.get("https://acme-test.uipath.com/login");
		Driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		Driver.findElement(By.name("password")).sendKeys("leaf@12");
		Driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		System.out.println("The title is "+ Driver.getTitle());
		
		Driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		Driver.close();
		
	}

}
