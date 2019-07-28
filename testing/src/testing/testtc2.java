package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtc2 {
	//get text bold and normal

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		List<WebElement>text=driver.findElements(By.tagName("p"));
		for(int i=0;i<text.size();i++){
			System.out.println("noram test+"+"  "+text.get(i).getText());
		}
		text=driver.findElements(By.tagName("B"));
		for(int n=0;n<text.size();n++){
			System.out.println(text.get(n).getText());
			
		}
	}

}
