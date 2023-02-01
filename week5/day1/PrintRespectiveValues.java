package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintRespectiveValues {

	public static void main(String[] args){
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://html.com/tags/table/");
		List<WebElement> analysis=driver.findElements(By.xpath("//div[@class='render']//tr[2]//td"));
		System.out.println(analysis.size());
		for (int j = 1; j < analysis.size(); j++) {
			String text = driver.findElement(By.xpath("//div[@class='render']//tr[2]["+j+"]//td")).getText();

		System.out.println(text);
		}
	}
}
