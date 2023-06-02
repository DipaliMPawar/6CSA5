package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element idenfied 1");
		
		driver.get("https://www.fb.com");
		driver.findElement(By.tagName("a"));
		System.out.println("element idenfied 2");
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element idenfied 3");
		
		driver.get("https://www.Zomato.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element idenfied 4");
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.tagName("a"));
		System.out.println("element idenfied 5");
		
		driver.get("https://www.Ajio.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element idenfied 6");
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element idenfied 7");
		
		driver.get("https://www.youtube.com");
		driver.findElement(By.tagName("a"));
		System.out.println("element idenfied 8");
		
		driver.get("https://www..com");
		driver.findElement(By.tagName("div"));
		System.out.println("element idenfied 9");
		
		driver.get("https://www.Swiggy.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element idenfied 10");
		
		

	}

}
