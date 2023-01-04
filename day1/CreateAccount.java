package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("groupNameLocal")).sendKeys("Pooja");
	driver.findElement(By.id("officeSiteName")).sendKeys("Madurai");
	driver.findElement(By.id("annualRevenue")).sendKeys("12,00,000");
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	Select drop =new Select(industry);
	drop.selectByValue("IND_SOFTWARE");
	WebElement owner = driver.findElement(By.name("ownershipEnumId"));
	Select drop1=new Select(owner);
	drop1.selectByVisibleText("S-Corporation");
	WebElement source = driver.findElement(By.id("dataSourceId"));
	Select drop2=new Select(source);
	drop2.selectByValue("LEAD_EMPLOYEE");
	WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	Select drop3=new Select(marketing);
	drop3.selectByIndex(6);
	WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select drop4=new Select(province);
	drop4.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	
	//obj.close();
    
}
}
