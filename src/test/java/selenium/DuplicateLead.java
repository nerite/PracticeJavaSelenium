package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://iarchtaps.com:8080/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Leads Link
		driver.findElement(By.linkText("Leads")).click();
		
		// Click Find Leads
		driver.findElement(By.partialLinkText("Find")).click();
		
		// Click on Email
		driver.findElement(By.linkText("Email")).click();
		
		// Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("test@test.com");
		
		// Click the Find Leads button
		driver.findElement(By.xpath("//button[starts-with(text(),'Find')]")).click();
		
		// Capture name of First Resulting lead
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		System.out.println("The name of First Resulting lead is: "+text);
		
		// Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		
		// Click Duplicate Lead
		driver.findElement(By.partialLinkText("Duplicate")).click();
		
		// Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title isn't correct");
		}
		
		// Click Create Lead
		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
		
		// Confirm the duplicated lead name is the same as the captured name
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name.equals(text)) {
			System.out.println("The Lead name \""+text+"\" and its duplicated lead name \""+name+"\" is the same");
		} else {
			System.out.println("The Lead name \""+text+"\" and its duplicated lead name \""+name+"\" is not the same");
		}
		// Close the browser (Do not log out)
		driver.close();
	}

}
