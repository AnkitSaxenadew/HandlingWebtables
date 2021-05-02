package Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findrwndclmn {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ANKIT/Desktop/lastest.html");

		driver.manage().window().maximize();
		//total no. of rows
		
		String rowxp="//table[@name='Num']//tr";
		
		List<WebElement> rows = driver.findElements(By.xpath(rowxp));
		
		System.out.println("total rows :"+rows.size());
		
		//total no. of column present inside each row
		int sum=0;
		
		for (int i = 1; i <=rows.size(); i++) 
		{
			String  colsxp="//table[@name='Num']//tr["+i+"]//td";
			
			List<WebElement> cols = driver.findElements(By.xpath(colsxp));
			
			System.out.println("Row :"+i+"total colmn :"+cols.size());
		
		
		//get all data from each row and each column
		
		
		for (int j = 1; j <=cols.size(); j++) //column
		{
			String dataxp="//table[@name='Num']//tr["+i+"]//td["+j+"]";
			
			String output = driver.findElement(By.xpath(dataxp)).getText();
			
			System.out.println(output);
			
			//total sum of all values
			sum=sum+Integer.parseInt(output);
		}
		}
		System.out.println("Total sum: "+sum);
	}
  
}
