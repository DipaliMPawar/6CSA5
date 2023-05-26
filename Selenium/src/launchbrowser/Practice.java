package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the 1 for lunching chrome browser and enter 2 edge browser");
		Scanner SC=new Scanner(System.in);
		int a=SC.nextInt();
		switch (a) {
		case 1:{
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.flipkart.com/");break;
			
		}
		case 2:{
			WebDriver driver =new EdgeDriver();
			driver.get("https://www.amazon.in/");break;
			
		}
			
		
		}
			
		
	}

}
