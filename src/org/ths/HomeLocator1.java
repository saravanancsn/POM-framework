package org.ths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLocator1 extends BaseClass {
	public HomeLocator1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='navUser-action'])[4]")
	private WebElement signbtn;
	@FindBy(id = "login_email")
	private WebElement logem;
	@FindBy(id = "login_pass")
	private WebElement logpw;
	@FindBy(xpath = "//input[@class='button button--primary']")
	private WebElement logbtn;

	public WebElement getSignbtn() {
		return signbtn;
	}

	public WebElement getLogem() {
		return logem;
	}

	public WebElement getLogpw() {
		return logpw;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

}
