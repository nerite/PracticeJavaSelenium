package selenium;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//input[starts-with(@class,'deco')]")).click();
		
		// Click CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		
		// Click Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		// Enter Company Name
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys(RandomStringUtils.randomAlphabetic(5));
		
		// Enter the First Name
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Neringa");
		
		// Enter the Last Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(RandomStringUtils.randomAlphabetic(3));
		
		// Choose Source
		WebElement source = driver.findElement(By.xpath("//select[contains(@id,'Source')]"));
		Select obj = new Select(source);
		obj.selectByVisibleText("Tradeshow");
		
		// Choose Marketing Campaign
		WebElement camp = driver.findElement(By.xpath("//select[contains(@id,'tingCamp')]"));
		Select mark = new Select(camp);
		mark.selectByIndex(5);
		
		// Enter phone number
		driver.findElement(By.xpath("//input[contains(@id,'PhoneN')]")).sendKeys("111222333");
		
		// Enter email address
		driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]")).sendKeys("test@test.com");
		
		// Click Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		// Capture the Lead ID
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String leadId = "";
		for(int i=0; i<text.length(); i++) {
			if(Character.isDigit(text.charAt(i))) {
				leadId += text.charAt(i);
			}
		}
		
		System.out.println("Created Lead ID is " + leadId);
		
		// Close the browser (Do not log out)
		driver.close();
	}

}
