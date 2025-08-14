package WaitUtlity;

import org.openqa.selenium.WebElement;

public interface ExplicitWait {
	
	public void visibletext(WebElement ele ,String text);
	public void waitforclick(WebElement ele);
	public void waitforaler();

}
