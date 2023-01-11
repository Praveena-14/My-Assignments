package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class DropDown {
public static void main(String[] args) throws Exception {

	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/select.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
	Select drop=new Select(tool);
	drop.selectByIndex(1);
	
	WebElement country = driver.findElement(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[1]"));
	Select drop1=new Select(country);
	drop1.selectByVisibleText("Germany");  
	WebElement language = driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[3]"));
    Select drop3=new Select(language);
	drop3.selectByVisibleText("English");		
	driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[4]")).click();
	driver.close();
	}

}
