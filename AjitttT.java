package ajtttt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AjitttT {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.edge.driver","D:\\MyWork\\New\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  
		 

	}

}
