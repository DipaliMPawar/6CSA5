package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www/youtube.com");
		Driver.close();
		

	}

}
