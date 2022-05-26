package intro_udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniuminto {

	public static void main(String[] args) {
		
		//Invoking browser
		
		
		System.setProperty("webdriver.chrome.driver", "K:/program files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nytimes.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
