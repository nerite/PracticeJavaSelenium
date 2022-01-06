package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://iarchtaps.com:8080/opentaps/");
		driver.manage().window().maximize();
		
		// Enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		// Click CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		// Click Leads Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		// Click Find leads
		driver.findElement(By.xpath("//a[starts-with(text(),'Find')]")).click();
		
		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		// Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("111222333");
		
		// Click the find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Capture Lead ID of First Resulting lead
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println("First Resulting Lead ID: "+ text);
		
		// Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		// Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		// Click Find Leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		// Enter captured Lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		// Click the find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Verify error msg  
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
		System.out.println("There was no record to display: " + text2.equals("No records to display"));
		
		// Close the browser (Do not log out)
		driver.close();
	}

}
