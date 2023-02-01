package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuAssignment {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//double click
		WebElement menu = driver.findElement(By.xpath("(//div[@class='ui-panelmenu-panel'])"));
		Actions action=new Actions(driver);
		action.doubleClick(menu).perform();
		System.out.println("Double click done");
		//right click
		WebElement rc = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
		Actions builder=new Actions(driver);
		builder.contextClick(rc).perform();
		System.out.println("RightClick Done");
		
	}
	
}
