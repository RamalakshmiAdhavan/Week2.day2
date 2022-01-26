package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dublicatelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
//		1	Launch the browser
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
//		2	Enter the username
		 WebElement userName=driver.findElement(By.id("username"));
		 userName.sendKeys("DemoCSR",Keys.TAB);
//		3	Enter the password
		 WebElement password =driver.findElement(By.id("password"));
		 password.sendKeys("crmsfa"); 
//		4	Click Login
	     driver.findElement(By.className("decorativeSubmit")).click();

//		5	Click crm/sfa link
		    driver.findElement(By.linkText("CRM/SFA")).click();

//		6	Click Leads link
			driver.findElement(By.linkText("Leads")).click();

//		7	Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();

//		8	Click on Email
			driver.findElement(By.xpath("//span[text()='Email']")).click();
//		9	Enter Email
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");

//		10	Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(3000);


//		11	Capture name of First Resulting lead
			String verifyTitle = driver.getTitle();
			System.out.println("View Lead Title: "+verifyTitle);
			
//		12	Click First Resulting lead
			String firstResultinglead = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
			System.out.println(firstResultinglead);
			
//		13	Click Duplicate Lead

			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			driver.findElement(By.xpath("//a[@class='subMenuButton'][1]")).click();	
//      14	Verify the title as 'Duplicate Lead'
			String verifyTile = driver.findElement(By.xpath("//title[1]")).getText();
			System.out.println(verifyTile);
			if(verifyTile.equalsIgnoreCase(firstResultinglead))
			{
				System.out.println("Duplicate Lead is Same");
			}
			
			else
				
			{
				System.out.println("Duplicate Lead is not same");
			}
			
//		
//		15	Close the browser (Do not log out)
			driver.close();


	}

}
