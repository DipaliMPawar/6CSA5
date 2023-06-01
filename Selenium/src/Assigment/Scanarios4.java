package Assigment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scanarios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().window().maximize();
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		System.out.println("=========================================================");
		Cookie cookie1=new Cookie("insta", "7");
		Cookie cookie2=new Cookie("fb", "7");
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie(cookie2);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		System.out.println("=========================================================");
		driver.manage().deleteCookie(cookie1);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		System.out.println("=========================================================");
		driver.manage().deleteCookieNamed("fb");
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		
		

	}

}
