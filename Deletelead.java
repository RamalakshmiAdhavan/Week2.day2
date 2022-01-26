package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

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
//		8	Click on Phone
			driver.findElement(By.xpath("//span[text()='Phone']")).click();

//		9	Enter phone number
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("70");

//		10	Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);

//		11	Capture lead ID of First Resulting lead
			String lead_value= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
			System.out.println("lead is "+lead_value);
			
			
//		12	Click First Resulting lead
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

//		13	Click Delete
			driver.findElement(By.linkText("Delete")).click();

//		14	Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();

//		15	Enter captured lead ID
			driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[1]")).sendKeys(lead_value);

//		16	Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			String Result = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		    System.out.println("result is"+Result);
			//		18	Close the browser (Do not log out)
		    if (Result.contains("No records to display"))
		        System.out.println("Deleted Lead is not displayed");
		     else
		     	 System.out.println("Deleted Lead is displayed");
		 	

	}

}
