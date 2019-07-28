package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekboxtc5 {
// count no elements by using on array chek box,links,dropdown,raido buttons
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		//count no of links
		List<WebElement>elements=driver.findElements(By.tagName("a"));
		System.out.println("no of links +"+"  "+elements.size());
		//count no of images
		elements=driver.findElements(By.tagName("img"));
		System.out.println("no of images +"+"  "+elements.size());
		//count no of radio
		elements=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radio +"+"  "+elements.size());
		////count no of chekbox
		elements=driver.findElements(By.xpath("//input[@type='chekbox']"));
		System.out.println("no of chekbox +"+"  "+elements.size());
		//count no of dropdowns
		elements=driver.findElements(By.tagName("option"));
		System.out.println("no of dropdown +"+"  "+elements.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
