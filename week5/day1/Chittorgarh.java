package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
	     //System.out.println("Row Count:"+rowCount.size());
	     List<WebElement> column = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr[2]/td"));
	     //System.out.println("Column Count:"+columncount.size());
	     List<String> lst=new ArrayList<String>();
	     Set<String> set = new LinkedHashSet<String>(lst);

		for (int i =1; i <row.size(); i++) {
			String text3 = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]/td[3]")).getText();
			System.out.println(text3);
			lst.add(text3);
		
		}

		//duplicate
		
		Set<String> duplicate= new TreeSet<String>(lst);
        System.out.println(duplicate);
        int listSize = lst.size();
        int setSize = set.size();
        
        if (listSize==setSize) {
    		
    		System.out.println("There is No  Duplicates in Security Name");
    		
    	}
    	
    	else {
    		
    		System.out.println("There is  Duplicates in security name");
    	}
    
        
	}

}
