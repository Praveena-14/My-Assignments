package locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		System.out.println("---On Clicking open Button----");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>fstWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(fstWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(fstWindow.get(0));
		
		System.out.println("---On clicking Open multiple Button---");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>sndWindow=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(sndWindow.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(sndWindow.get(2));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		//ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		//System.out.println("No.of tabs:"+tabs.size());
		driver.switchTo().window(fstWindow.get(0));
		
		System.out.println("---On clicking Close Button---");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>alWindow=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(alWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(alWindow.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(alWindow.get(3));
		System.out.println(driver.getTitle());
		//ArrayList<String> tabs1= new ArrayList<String>(driver.getWindowHandles());
		//System.out.println("No.of tabs:"+tabs1.size());
		driver.close();
		driver.switchTo().window(fstWindow.get(0));
		
		System.out.println("---On clicking open with delay Button---");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
	Thread.sleep(20000);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String>deWindow=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(deWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(deWindow.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
        //driver.close();
		
	}

}
