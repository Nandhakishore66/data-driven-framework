package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothCorrect {
	
	
	@Test
	public void loginWithBothCorrect() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\NAVEEN\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
	
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		driver.quit();
}

}
