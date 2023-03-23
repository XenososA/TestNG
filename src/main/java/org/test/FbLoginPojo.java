package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo {
	public FbLoginPojo() {
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
