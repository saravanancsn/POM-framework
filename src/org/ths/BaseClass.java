package org.ths;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void quit() {
		driver.quit();
	}

	public static void screenShot(String path) throws Exception {
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(s, d);
	}

	public static void click(WebElement j) {
		j.click();
	}

	public static void type(WebElement l, String j) {
		l.sendKeys(j);
	}

	public static void getText(WebElement l) {
		System.out.println(l.getText());
	}

	public static void wait(int t) {
		driver.manage().timeouts().pageLoadTimeout(t, TimeUnit.SECONDS);
	}

	public static void jclick(WebElement h) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click", h);
	}
	public static void frame(int o) {
		driver.switchTo().frame(o);
	}
}
