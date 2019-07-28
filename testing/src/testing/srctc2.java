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

public class srctc2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cnbc.com/world/?region=world");
		
		List<WebElement>links=driver.findElements(By.linkText("BKSF"));
		if(links.size()==0){
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("c:\\User\\LENOVO\\Desktop\\New Bitmap Image.bmp.png"));
		
		}
		
		else{
			links.get(0).click();
		}
	}

}
