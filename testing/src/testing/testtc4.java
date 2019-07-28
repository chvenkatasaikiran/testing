package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtc4 {

	public static void main(String[] args) {
		// new tours click on register pass  chek reg scuu or not
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("sai");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("kiran");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("9493555465");
		driver.findElement(By.name("userName")).sendKeys("itsmesaikiranch");
		driver.findElement(By.name("address1")).sendKeys("ipur");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys("guntur");
		driver.findElement(By.name("state")).sendKeys("ap");
		driver.findElement(By.name("postalCode")).sendKeys("522658");
		driver.findElement(By.tagName("option"));
	WebElement dropdown=	driver.findElement(By.tagName("select"));
	dropdown.sendKeys("INDIA");
	driver.findElement(By.id("email")).sendKeys("kian");
	driver.findElement(By.name("password")).sendKeys("india123");
	driver.findElement(By.name("confirmPassword")).sendKeys("india123");
	driver.findElement(By.name("register")).click();
	
	String actual="kian";
	String expect=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	if(expect.contains(actual)){
		System.out.println("succes");
	}
	else{
		System.out.println("fail");
	}

	}

}
