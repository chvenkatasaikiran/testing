package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekboxtc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		List<WebElement>chekbox=driver.findElements(By.xpath("//input[@type='chekbox']"));
	    System.out.println(chekbox.size());
	    for(int i=0;i<chekbox.size();i++){
	    	if(chekbox.get(i).isSelected()){
	    		System.out.println("is in active");
	    	}
	    	else{
	    		System.out.println("in active");
	    	}
	    }
	}

}
