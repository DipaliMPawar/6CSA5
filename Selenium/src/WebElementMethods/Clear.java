package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/selenium/username.html");
		WebElement textbox=driver.findElement(By.xpath("//input[@value=\"USERNAME\"]"));
		textbox.clear();
		textbox.sendKeys("hello");

	}

}
