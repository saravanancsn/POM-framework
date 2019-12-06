package org.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel {
 static WebDriver  driver;
public static void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
}public static void closeBrowser() {
	driver.quit();
}public static void type(WebElement l,String in) {
l.sendKeys(in);
}public static void click(WebElement l) {
	l.click();
}public static void screenShot(String path) throws IOException {
	TakesScreenshot t = (TakesScreenshot) driver;
	File source = t.getScreenshotAs(OutputType.FILE);
	File dest = new File(path);
	FileUtils.copyFile(source, dest);
}public static void selectByText(WebElement l,String in) {
	Select s = new Select(l);
	s.selectByVisibleText(in);
}
}

