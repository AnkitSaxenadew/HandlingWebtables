package Handle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldnup {

	private static final JavascriptExecutor JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.navigate().to("https://www.seleniumhq.org/");
        
        //scroll down 
        String jscode1="window.scrollBy(0,document.body.scrollHeight)";
        
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript(jscode1);
        
        //scroll up the web page
        Thread.sleep(3000);
        String jscode2="window.scrollBy(0,-1000)";
        je.executeScript(jscode2);
        

	}

}
