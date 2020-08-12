package com.NopEcom.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.NopEcomerce.Pages.LoginPage;

import helper.BrowserFactory;

public class VarifyValidUser {

	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("firefox",
				"https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
		LoginPage loginNop = PageFactory.initElements(driver, LoginPage.class);
		loginNop.loginNopEcom("raghuchaithu123", "chaithu@123");
	}
}
