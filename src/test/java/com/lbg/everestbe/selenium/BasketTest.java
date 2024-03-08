package com.lbg.everestbe.selenium;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketTest {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@Test
	@Order(1)
	void testBasket() {
		this.driver.get("http://localhost:3000/items");

		WebElement addToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#root > div:nth-child(2) > div > div > div > div > div > button.btn.btn-success.btn-md")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
		addToCart.click();

		WebElement basketclick = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[4]/a/svg"));
		basketclick.click();
	}

}
