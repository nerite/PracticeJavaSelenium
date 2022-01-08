package selenium;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://iarchtaps.com:8080/opentaps/");
		driver.manage().window().maximize();
		
		// Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		// Click CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		// Click Leads Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		// Click Find Leads
		driver.findElement(By.xpath("//a[starts-with(text(),'Find')]")).click();
		
		// Enter the First Name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Neringa");
		
		// Click the Find Leads button
		driver.findElement(By.xpath("//button[starts-with(text(),'Find')]")).click();
		
		// Click on First Resulting lead
		Thread.sleep(2000);
		//String txt = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]/a")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		// Verify the title of the page
		String title = driver.getTitle();
		System.out.println("The page title is correct: " + title.equals("View Lead | opentaps CRM"));
		
		// click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		// Change the Company name
		String oldT = driver.findElement(By.xpath("//input[contains(@id,'companyN')]")).getAttribute("value");
		driver.findElement(By.xpath("//input[contains(@id,'companyN')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'companyN')]")).sendKeys(RandomStringUtils.randomAlphabetic(5));
							
		// Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		// Confirm the Changed name appears
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("The Company name has bean changed from \"" + oldT + "\" to \"" + text+ " \"");
		
		// Close the browser (Do not log out)
		driver.close();
	}

}
