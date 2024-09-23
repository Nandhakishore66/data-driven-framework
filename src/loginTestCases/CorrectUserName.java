package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CorrectUserName {
	
  String [][] data=	{
		{"Admin","admin123"},
		{"admin","admin12"},
		{"admin","admin123"},
		{"Admin","admin"}
	};
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	
	
		@Test(dataProvider="loginData")
		public void loginWithCorrectUserName(String uName,String pass) {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\NAVEEN\\\\driver\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			WebElement userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys(uName);
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(pass);
		
			WebElement loginBtn=driver.findElement(By.id("btnLogin"));
			loginBtn.click();
			
			driver.quit();
	}
}
		

//When we use Datadriven framework?
//There is no change in functionality but there is a change in data at that time we use this data driven frameWork 

//The definition of framework is reusability 1.reusability 2.organised 3.Managable 4.understandabale 5.Scalable 6.Cost Effecrive
//7.Rules 8.Standard
