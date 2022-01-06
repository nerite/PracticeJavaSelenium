package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://iarchtaps.com:8080/opentaps/");
		driver.manage().window().maximize();
		
		// Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/")).click();
		
		// Click Leads Link
		driver.findElement(By.linkText("Leads")).click();
		
		// Click Merge leads
		driver.findElement(By.partialLinkText("Merge")).click();
		
		// Click on Icon near From Lead
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		// Move to a new window
		Set<String> window = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(window);
		driver.switchTo().window(lst.get(1));
		
		// Enter Lead ID
		driver.findElement(By.name("firstName")).sendKeys("Neringa");
		
		// Click Find Leads
		driver.findElement(By.className("x-btn-text")).click();
		
		// Click First Resulting lead
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		// Switch back to the primary window
		driver.switchTo().window(lst.get(0));
		
		// Click on Icon near To Lead
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		// Move to the new window
		window = driver.getWindowHandles();
		lst = new ArrayList<String>(window);
		driver.switchTo().window(lst.get(1));
		
		// Enter Lead ID
		driver.findElement(By.name("firstName")).sendKeys("Neringa");
		
		// Click Find Leads
		driver.findElement(By.className("x-btn-text")).click();
		
		// Click First Resulting lead
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		
		// Switch back to the primary window
		driver.switchTo().window(lst.get(0));
		
		// Click Merge
		driver.findElement(By.className("buttonDangerous")).click();
		
		// Accept Alert
		driver.switchTo().alert().accept();
		
		// Click Find Leads
		driver.findElement(By.partialLinkText("Find")).click();
		
		// Enter From Lead Id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(txt);
		
		// Click Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Verify error msg
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
		System.out.println("There was no record to display: " + text.equals("No records to display"));
		
		// Close the browser (Do not log out)
		driver.close();
		
	}

}
