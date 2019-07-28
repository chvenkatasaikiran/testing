package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithtext {
	//yahoo.com count normal test and bold test elements

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//normal test
		List<WebElement>text=driver.findElements(By.tagName("p"));
		System.out.println("noram test +"+"  "+text.size());
		//bold test
		text=driver.findElements(By.tagName("B"));
		System.out.println("bold test +"+"  "+text.size());
     	//	all test
		text=driver.findElements(By.tagName("body"));
		System.out.println("bold test +"+"  "+text.size());

		
		

	}

}
