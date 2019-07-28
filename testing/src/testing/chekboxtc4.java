package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekboxtc4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		student.click();
		if(student.isSelected()){
			System.out.println("active");
		}
		else{
			System.out.println("in active");
		}
	}

}
