package TypeCasting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchContextUpCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.Driver","./geckodriver.exe");
		SearchContext driver=new FirefoxDriver();

	}

}
