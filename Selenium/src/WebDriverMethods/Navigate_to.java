package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		URL url=new URL("https:www.fb.com");//create object ofURL class after importing
		driver.navigate().to(url);//pass url variable of object as argument
		
		

	}

}
