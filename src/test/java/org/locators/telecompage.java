package org.locators;

import java.util.List;

import org.commonaction.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class telecompage extends CommonActions{

	public telecompage() 
	{	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3/a[text()='Add Customer']")
	private WebElement addcustomer;
	
	@FindBy(xpath="//iframe[@id='flow_close_btn_iframe']")
	private WebElement fframe;
	
	@FindBy(xpath="//div[@id='closeBtn']")
	private WebElement closebtn;
	
	@FindBy(id="fname")
	private WebElement fnme;
	
	@FindBy(id="lname")
	private WebElement lnme;
	
	@FindBy(id="email")
	private WebElement mail;

	public WebElement getAddcustomer() {
		return addcustomer;
	}

	public WebElement getFframe() {
		return fframe;
	}

	public WebElement getClosebtn() {
		return closebtn;
	}

	public WebElement getFnme() {
		return fnme;
	}

	public WebElement getLnme() {
		return lnme;
	}

	public WebElement getMail() {
		return mail;
	}
	
	/*@FindBys({
	@FindBy(id="email"),@FindBy(id="email1")
	})
	private List<WebElement> uname1;*/

	
	
}
