package Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		driver.manage().window().maximize();
		//type user name 
		String nm = "//input[@name='ctl00$MainContent$username']";
	     WebElement usnm = driver.findElement(By.xpath(nm));
	
	     usnm.sendKeys("Tester");
	    // type password 
	     WebElement pwd = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
	     
	     pwd.sendKeys("test");
        // click login button
	     WebElement btn = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
	     
	     btn.click();
	     //find out number of rows
	     String rowxp = "//table[@id='ctl00_MainContent_orderGrid']//tr";
	     
	     List<WebElement> rows = driver.findElements(By.xpath(rowxp));
	     System.out.println("total rows :"+rows.size());
	     
	     
	     for (int i = 2; i <=rows.size(); i++)
	     {
	    	 //find out total columns
			String colsxp="//table[@id='ctl00_MainContent_orderGrid']//tr["+i+"]//td";
			
			List<WebElement> cols = driver.findElements(By.xpath(colsxp));
			
			System.out.println("Row no. :"+i+"Total column :"+cols.size());
		
						
			
	     for (int j = 2; j <=cols.size(); j++)
	     {
	    	 String dataxp = "//table[@id='ctl00_MainContent_orderGrid']//tr["+i+"]//td["+j+"]";
	    	 
	    	 String output = driver.findElement(By.xpath(dataxp)).getText();
	    	 
	    	 System.out.println(output);
			
		}
			}
	
	}

}
