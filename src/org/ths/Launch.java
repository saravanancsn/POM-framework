package org.ths;

public class Launch extends BaseClass {
	public static void main(String[] args) throws Exception {

		launchBrowser("https://www.totalhomesupply.com/");
		screenShot("F:\\SS\\Total home Supply\\1.jpeg");
		HomeLocator1 h1 = new HomeLocator1();
		click(h1.getSignbtn());
		type(h1.getLogem(), "jackcherry4896@gmail.com");
		type(h1.getLogpw(), "abc@123");
		screenShot("F:\\SS\\Total home Supply\\2.jpeg");
		click(h1.getLogbtn());
		wait(20);
		screenShot("F:\\SS\\Total home Supply\\3.jpeg");
		HomeLocator2 h2 = new HomeLocator2();
		click(h2.getAir());
		screenShot("F:\\SS\\Total home Supply\\4.jpeg");
		click(h2.getSelect1());
		wait(20);
		screenShot("F:\\SS\\Total home Supply\\5.jpeg");
		getText(h2.getPrize());
		type(h2.getSearch(), "vented log sets");
		screenShot("F:\\SS\\Total home Supply\\6.jpeg");
		click(h2.getSrchbtn());
		wait(20);
		screenShot("F:\\SS\\Total home Supply\\7.jpeg");
		HomeLocator3 h3 = new HomeLocator3();
		click(h3.getImg());
		click(h3.getCart());
		screenShot("F:\\SS\\Total home Supply\\8.jpeg");
		frame(1);
		click(h3.getProceed());
		click(h3.getCnte());
		wait(20);
		type(h3.getCreditcard(), "6551 4237 6213 7548165");
		type(h3.getCreditname(), "SDS");
		click(h3.getLater());
		screenShot("F:\\SS\\Total home Supply\\9.jpeg");
		click(h3.getEditcart());
		click(h3.getCancel());
		click(h3.getConfirmcancel());
		screenShot("F:\\SS\\Total home Supply\\10.jpeg");
		click(h3.getSignout());
		screenShot("F:\\SS\\Total home Supply\\11.jpeg");
		quit();
	}
}
