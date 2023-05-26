package launchbrowser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriver driver2 = new EdgeDriver();
		Dimension d1= new Dimension(600,800);
		driver.manage().window().setSize(d1);
		Dimension d2=new Dimension(600,800);
		driver2.manage().window().setSize(d2);
		Point a =new Point(0,0);
		driver.manage().window().setPosition(a);
		Point b=new Point(700,0);
		driver2.manage().window().setPosition(b);

		
		


	}

}
