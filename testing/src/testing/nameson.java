package testing;

import java.util.List;import org.apache.http.entity.mime.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameson {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		WebElement partical=driver.findElement(By.id("familyandfriend"));
	   System.out.println(partical.getAttribute("src"));
	   
   }
	}

