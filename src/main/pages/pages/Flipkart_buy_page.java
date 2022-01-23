package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Flipkart_baselibrary;

public class Flipkart_buy_page extends Flipkart_baselibrary

{
	public Flipkart_buy_page()

	{
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement close;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]")

	private WebElement mobile;

	@FindBy(xpath = "//*[@class=\"_1_3w1N\"][text()='Login']")
	private WebElement loginpage;

	@FindBy(xpath = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement email;

	@FindBy(xpath = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	private WebElement password;

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	private WebElement login;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]")
	private WebElement newmobile;

	public void login()

	{
		close.click();
		loginpage.click();
		email.sendKeys("8171765673");

		password.sendKeys("Shivu@srd1");

		login.click();
		// mobile.click();

	}

}
