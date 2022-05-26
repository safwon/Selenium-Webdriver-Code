package intro_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators2 {
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passText = driver.findElement(By.cssSelector("form p")).getText();
		String passarr[] = passText.split("'");
		String Password = passarr[1].split("'")[0];
		return Password;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		String name= "Sadif";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "K:/program files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String password = getPassword(driver);

			driver.get("https://rahulshettyacademy.com/locatorspractice/");

			driver.findElement(By.id("inputUsername")).sendKeys(name);

			driver.findElement(By.name("inputPassword")).sendKeys(password);

			driver.findElement(By.className("signInBtn")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    System.out.println(driver.findElement(By.tagName("p")).getText());
		    driver.findElement(By.cssSelector("button.logout-btn")).click();
		   // driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		    


	}
	

}
