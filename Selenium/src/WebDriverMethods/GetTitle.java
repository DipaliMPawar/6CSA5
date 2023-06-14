package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());

	}

}
