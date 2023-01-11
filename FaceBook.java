package week3.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Praveena");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Arun Kumar");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9856231475");
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Pravi@1");
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select drop1=new Select(day);
	drop1.selectByValue("14");
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select drop2=new Select(month);
	drop2.selectByVisibleText("Sep");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select drop3=new Select(year);
	drop3.selectByValue("1996");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	//driver.close();
}
}
