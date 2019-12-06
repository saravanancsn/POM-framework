package org.ths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLocator2 extends BaseClass {
	public HomeLocator2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='navPages-action has-subMenu'])[1]")
	private WebElement air;
	@FindBy(xpath = "(//span[@class='view_btn_mn'])[2]")
	private WebElement select1;
	@FindBy(xpath = "(//span[@class='price price--withoutTax'])[1]")
	private WebElement prize;
	@FindBy(xpath = "(//input[@class='form-input'])[2]")
	private WebElement search;
	@FindBy(xpath = "(//input[@class='search_btn'])[2]")
	private WebElement srchbtn;

	public WebElement getAir() {
		return air;
	}

	public WebElement getSelect1() {
		return select1;
	}

	public WebElement getPrize() {
		return prize;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}
}
