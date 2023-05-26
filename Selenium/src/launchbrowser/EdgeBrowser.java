package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String args[]) {
		
		System.setProperty("WebDriver.Edge.Browser", "./edgedriver.exe");
		EdgeDriver driver=new EdgeDriver();

		
	}

}
