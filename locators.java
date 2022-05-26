package intro_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		
	/*	System.setProperty("webdriver.chrome.driver", "K:/program files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); 
		driver.findElement(By.name("inputPassword")).sendKeys("1234567");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p")).gett);
		}*/
		
		
		

			// TODO Auto-generated method stub

			//implicit wait - 2 seconds time out
		System.setProperty("webdriver.chrome.driver", "K:/program files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.get("https://rahulshettyacademy.com/locatorspractice/");

			driver.findElement(By.id("inputUsername")).sendKeys("rahul");

			driver.findElement(By.name("inputPassword")).sendKeys("hello123");

			driver.findElement(By.className("signInBtn")).click();

			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

			driver.findElement(By.linkText("Forgot your password?")).click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

			driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

			System.out.println(driver.findElement(By.cssSelector("form p")).getText());

			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

			driver.findElement(By.id("chkboxOne")).click();

			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

			}


		
	
	}


