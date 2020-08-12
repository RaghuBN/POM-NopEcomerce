package com.NopEcomerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "Username")
	WebElement username;

	@FindBy(how = How.NAME, using = "Password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[contains(@type,'submit')]")
	WebElement loginbtn;

	public void loginNopEcom(String uname, String pass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();

	}
}
