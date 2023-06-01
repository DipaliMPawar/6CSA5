package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.acttime.com/login.do");
		String actualResult=driver.getTitle();
		String expectedResult="https://www.facebook.com/login";
		if(actualResult.equals(expectedResult)) //use equals method as==compares references of object /string
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(actualResult==expectedResult) //use equals method as==compares references of object /string
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
}
}


