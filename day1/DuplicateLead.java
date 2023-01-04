package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Student");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Batch");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praveenapraveeja@gmail.com");
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.linkText("Duplicate Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).clear();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bluestar");
    driver.findElement(By.id("createLeadForm_firstName")).clear();
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("veena");
    driver.findElement(By.className("smallSubmit")).click();
    String title = driver.getTitle();
    System.out.println(title);
    //driver.close();
    
}
}
