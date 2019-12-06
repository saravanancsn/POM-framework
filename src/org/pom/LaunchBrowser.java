package org.pom;

public class LaunchBrowser extends PageObjectModel {
	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/");
		FaceBookLocator f =new FaceBookLocator();
		type(f.getTxtemail(),"AAA");
		type(f.getTxtpass(), "BBB");
		click(f.getBtnlogin());
		closeBrowser();
	}

}
