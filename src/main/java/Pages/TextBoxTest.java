package Pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrarty.Baselibrary;

public class TextBoxTest  extends Baselibrary{
	TextBox od;
	@BeforeTest
	public void launcurl()
	{
		LaunchUrl();
		od = new TextBox();
	}
	
	@Test
	public void element()
	{
		od.clickonelement();
	}
	@Test
	public void clickontext()
	{
		od.clickontext();
	}
	
	

}
