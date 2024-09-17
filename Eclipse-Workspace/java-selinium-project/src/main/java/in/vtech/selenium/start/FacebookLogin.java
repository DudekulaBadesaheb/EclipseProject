package in.vtech.selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		String chromeDriver = "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		System.out.println(System.getProperty("webdrive.chrome.driver"	));

		WebDriver driver;
		driver = new ChromeDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		
		//type the username
		driver.findElement(By.name("email")).sendKeys("badesahebd7@gmail.com");
		//type the password
		driver.findElement(By.name("pass")).sendKeys("Pakiramma");
		//clik the login button
		driver.findElement(By.name("login")).click();
		//driver.quit();
	}

}
