package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("passcontainer"));
		int emailX=email.getRect().x;
		int passX=pass.getRect().x;
		if(emailX==passX)
		{
			System.out.println("left aligned");
		}
		else 
		{
			System.out.println("not left aligned");
		}

		

	}

	private static WebDriver ChromeDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
