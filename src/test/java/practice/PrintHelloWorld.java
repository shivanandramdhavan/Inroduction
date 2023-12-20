package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHelloWorld {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//System.out.println("Hello, World");
		
		driver.get("https://translate.google.com/");
		String URL = driver.getCurrentUrl();
		String Title = driver.getTitle();
		//String PageSource = driver.getPageSource();
		
		System.out.println("Current URL: " + URL);
		System.out.println("Page title: " + Title);
		//System.out.println("Page source is " + PageSource);
		
		driver.quit();
	}

}
