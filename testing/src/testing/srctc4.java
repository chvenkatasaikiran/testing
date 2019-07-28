package testing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class srctc4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cnbc.com/world/?region=world");
		List<WebElement>links=driver.findElements(By.tagName("a"));	
		for(int i=0;i<=links.size();i++){
			if(links.get(i).isDisplayed()){
			String lname=links.get(i).getText();
			links.get(i).click();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("c:\\User\\LENOVO\\Desktop\\New Bitmap Image.bmp.png"));
			driver.navigate().back();
			
		links=driver.findElements(By.linkText("Gmail"));
			
			
		
			}
					
		}
		
    
	}

}
