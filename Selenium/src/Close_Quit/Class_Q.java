package Close_Quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.get("https://www.fb.com");
		driver.get("httos://www.google.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.youtube.com");
//		URL url = new URL("https:www.google.com/");
//		driver.navigate().to(url);
		
		
		

	}

}
