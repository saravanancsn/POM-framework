package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLocator extends PageObjectModel {
	public FaceBookLocator() {
		PageFactory.initElements(driver, this);
	}@FindBy(id="email")
	private WebElement txtemail;
	@FindBy(id="pass")
	private WebElement txtpass;
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	private WebElement btnlogin;
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	

}
