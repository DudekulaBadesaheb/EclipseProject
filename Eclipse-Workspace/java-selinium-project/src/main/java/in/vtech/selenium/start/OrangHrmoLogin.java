package in.vtech.selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangHrmoLogin {

	public static void main(String[] args) {
		String chromeDriver = "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		System.out.println(System.getProperty("webdrive.chrome.driver"));

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		String url = "https://www.facebook.com";
		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

//		Thread.sleep(5000);

		// type the username
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		// type the password
		WebElement PasswordField = driver.findElement(By.name("password"));
		PasswordField.sendKeys("admin123");
		// click the login button
		WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginButton.click();
	}

}
