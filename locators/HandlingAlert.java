package locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/alert.xhtml");
	//click to simple alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
    String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
    System.out.println(text2);
    
  //click to confirm alert
    
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
	Alert alert2 = driver.switchTo().alert();
	String text1 = alert2.getText();
	System.out.println(text1);
	alert2.dismiss();
	String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
	System.out.println(text3);
	
	//sweet alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    System.out.println(driver.findElement(By.xpath("//span[text()='Dismiss']")).getText());
    

	//click to sweet modal
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
	driver.findElement(By.xpath("(//div[@class='card'])[1]")).click();
	
	//click to prompt alert
    
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
    Alert alert3 = driver.switchTo().alert();
	alert3.sendKeys("Praveena");
	String text4 = alert3.getText();
	System.out.println(text4);
	alert3.accept();
  
	//click to confirmation sweet alert
	
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
	driver.findElement(By.xpath("//span[text()='Yes']")).click();
	
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();

	
	
	//driver.close();

	
}
}
