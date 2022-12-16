package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class Demo1 extends BaseClass {

	@Test(priority = 1)
	public void setUp() {
		BaseClass.inilization();
	}

	@Test(priority = 2)
	public void loginFuctionality() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Test(priority = 3)
	public void clickonPIM() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		String url = driver.getCurrentUrl();
		boolean a = url.contains("pim");

		Assert.assertEquals(a, true);
	}

	@Test(priority = 4)
	public void addnewUser() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();

		driver.findElement(By.name("firstName")).sendKeys("abc");
		driver.findElement(By.name("middleName")).sendKeys("pqr");
		driver.findElement(By.name("lastName")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-inpu')])[5]")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

	@Test(priority = 5)
	public void addMorePersonalInfo() {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
			
		WebElement wb =driver.findElement(By.xpath("//div[text()='Indian']"));
	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		
		wb.click();
		
		
		
		
		

	}

}
