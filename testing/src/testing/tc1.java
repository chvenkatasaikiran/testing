package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/?gclid=CjwKCAjwg-DpBRBbEiwAEV1_-HeYUaqKWYH133Iw0B3giUo32oswzIbxjLSBjlCIr3sab3zefixkhBoCqSAQAvD_BwE");
	List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
	for(int i=0;i<radios.size();i++){
		String rname=radios.get(i).getAttribute("src");
		if(radios.get(i).isSelected()){
			System.out.println("active");
			
		}
		else{
			System.out.println("in active");
		}
	}
	
	}

}
