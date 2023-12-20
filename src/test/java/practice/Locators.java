package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// Login to PMS (Tridhya Tech)

		WebDriver driver = new ChromeDriver();
		driver.get("https://pms.tridhyatech.com/login");
		driver.manage().window().maximize();
		//ID: shivanand.dhavan@contcentric.com and Password: Shivanand@2023
		driver.findElement(By.id("email")).sendKeys("shivanand.dhavan@contcentric.com");
		driver.findElement(By.name("password")).sendKeys("Shivanand@1234"); //Incorrect password
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/form/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.close();
	}

}
