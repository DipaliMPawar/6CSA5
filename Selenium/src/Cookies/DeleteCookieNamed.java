package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Cookie cooky = new Cookie("Selenium","4");
		driver.manage().addCookie(cooky);
		driver.manage().deleteCookieNamed("Selenium");
		System.out.println(cooky);
		

	}

}
