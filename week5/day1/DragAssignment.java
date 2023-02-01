package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//drag
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		System.out.println(drag.getLocation());
		Actions action=new Actions(driver);
		action.dragAndDropBy(drag, 50, 45).perform();
		System.out.println(drag.getLocation());
		//drop
		System.out.println("---------");
		WebElement target = driver.findElement(By.id("form:drop"));
		WebElement drop = driver.findElement(By.id("form:drag_content"));
		System.out.println(drop.getLocation());
		Actions action1=new Actions(driver);
		action1.dragAndDrop(drop, target).perform();
		System.out.println(target.getLocation());
		
		
	}
}
