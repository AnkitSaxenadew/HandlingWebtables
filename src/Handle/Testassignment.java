package Handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testassignment {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		driver.manage().window().maximize();
		
		before="//table[@id='ctl00_MainContent_orderGrid']//tr[1]//th";

	}

}
