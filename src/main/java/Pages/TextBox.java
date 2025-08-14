package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrarty.Baselibrary;

public class TextBox  extends Baselibrary{
	
	public TextBox()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card")
	private WebElement Element;
	
	@FindBy(xpath="//span[text()='Text Box']")
	private WebElement Textbox;
	
	public void  clickonelement()
	{
		 waitforclick(Element);
	}
	public void clickontext()
	{
	     waitforclick(Textbox);
	}
	

}
