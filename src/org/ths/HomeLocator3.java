package org.ths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLocator3 extends BaseClass {
	public HomeLocator3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='White Mountain Hearth LSU-30RR 30']")
	private WebElement img;
	@FindBy(id = "form-action-addToCart")
	private WebElement cart;
	@FindBy(xpath = "//a[@class='button']")
	private WebElement proceed;
	@FindBy(id = "checkout-shipping-continue")
	private WebElement cnte;
	@FindBy(id = "ccNumber")
	private WebElement creditcard;
	@FindBy(id = "ccName")
	private WebElement creditname;
	@FindBy(xpath = "//label[@for='shouldSaveInstrument']")
	private WebElement later;
	@FindBy(id = "cart-edit-link")
	private WebElement editcart;
	@FindBy(id = "icon-close")
	private WebElement cancel;
	@FindBy(xpath = "//button[@class='swal2-confirm button']")
	private WebElement confirmcancel;
	@FindBy(xpath = "(//a[contains(text(),'Sign out')])[1]")
	private WebElement signout;

	public WebElement getImg() {
		return img;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getCnte() {
		return cnte;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCreditname() {
		return creditname;
	}

	public WebElement getLater() {
		return later;
	}

	public WebElement getEditcart() {
		return editcart;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getConfirmcancel() {
		return confirmcancel;
	}

	public WebElement getSignout() {
		return signout;
	}
}
