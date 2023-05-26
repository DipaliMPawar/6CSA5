package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.Browser", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

	}

}
