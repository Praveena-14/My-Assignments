package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsColumns {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://html.com/tags/table/");
		//row
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		
		System.out.println("Number of rows"+rows.size());
		//column
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']//tr//td"));

        System.out.println("Number of columns"+column.size());
	}
	
	
}
