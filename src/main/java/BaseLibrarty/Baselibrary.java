package BaseLibrarty;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WaitUtlity.ExplicitWait;

public class Baselibrary  implements ExplicitWait,{
 public static WebDriver  driver=null;
	public void LaunchUrl()
	{
//		String path="C:\\Users\\kubom\\Desktop\\automationtesting\\ToolsQA\\Driver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver",path);
//		
	 driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Override
	public void visibletext(WebElement ele, String text) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		 ele.sendKeys(text);
		
	}
	public void waitforclick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 ele.click();
		
		
	}
	@Override
	public void waitforaler() {
		// TODO Auto-generated method stub
		
	}
}
