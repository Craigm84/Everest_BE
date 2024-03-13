package com.lbg.everestbe.selenium;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@TestMethodOrder(OrderAnnotation.class)

@Sql(scripts = { "classpath:everest-schema.sql",
		"classpath:everest-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)

public class CustomerTest {

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
	void testCreate() {
		this.driver.get("http://localhost:3000/");

		WebElement newCustLink = this.driver.findElement(By.cssSelector(
				"#root > div.main-navbar.shadow-sm.sticky-top > div > div > div > div.col-md-5.my-auto > ul > li:nth-child(1) > a"));
		newCustLink.click();

		WebElement name = this.driver.findElement(By.cssSelector("#name"));
		name.sendKeys("Jordan Harrison");

		WebElement address = this.driver.findElement(By.cssSelector("#address"));
		address.sendKeys("123 Road");

		WebElement email = this.driver.findElement(By.cssSelector("#email"));
		email.sendKeys("JH@domain.com");

		WebElement phone = this.driver.findElement(By.cssSelector("#phone"));
		phone.sendKeys("012345678");

		WebElement username = this.driver.findElement(By.cssSelector("#username"));
		username.sendKeys("JHarry2024");

		WebElement password = this.driver.findElement(By.cssSelector("#password"));
		password.sendKeys("JHarry2024");

		WebElement clickSubmit = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submit\"]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickSubmit);
		clickSubmit.click();

		WebElement display = this.driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > div:nth-child(3) > div > div > div > div > div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", display);
		Assertions.assertEquals(true, display.getText().contains("JHarry2024"));

		WebElement editCust = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#edit")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);", editCust);
		editCust.click();

		WebElement updateUser = this.driver.findElement(By.cssSelector("#username"));
		updateUser.sendKeys(".V2");

		WebElement clickUpdate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("update")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickUpdate);
		clickUpdate.click();

		WebElement amendedUser = this.driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > div:nth-child(3) > div > div > div > div > div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amendedUser);
		Assertions.assertEquals(true, amendedUser.getText().contains("JHarry2024.V2"));

	}
}