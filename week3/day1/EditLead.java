package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.github.dockerjava.api.model.Driver;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Praveena");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.linkText("11364")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("saccs");
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	if(text.contains("saccs")) {
		System.out.println("Change occured");
	}
	else {
		System.out.println("No change");
	}
//driver.close();

}
}
