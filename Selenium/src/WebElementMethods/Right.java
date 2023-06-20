package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.acttime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("pwd"));
		int userX=username.getRect().x;
		int passX=password.getRect().x;
		int userwidth=username.getRect().width;
		int passwidth=password.getRect().width;

		if(userX+userwidth==passX+passwidth)
		{
			System.out.println("Right aligned");
		}
		else 
		{
			System.out.println("not Right aligned");
		}


	}

}
