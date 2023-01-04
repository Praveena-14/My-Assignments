package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");	
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praveena");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ArunKumar");
    WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select drop1=new Select(tool);
    drop1.selectByVisibleText("Employee");
    WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    Select drop2=new Select(market);
    drop2.selectByValue("9001");
    WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    Select drop3=new Select(owner);
    drop3.selectByIndex(5);
    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
    Select drop4=new Select(country);
    drop4.selectByVisibleText("India");
    driver.findElement(By.name("submitButton")).click();
    String title1 = driver.getTitle();
   System.out.println(title1); 
    
    //driver.close();
}
}
