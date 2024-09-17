package commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComments {

	public static void main(String[] args) throws Exception {
		String chromeDriver = "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		System.out.println(System.getProperty("webdrive.chrome.driver"));

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//			String url = "https://www.facebook.com";
		String baseUrl = "https://demo.guru99.com/test/newtours";
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		Thread.sleep(5000);

		// getCurrentUrl()
		// this will get the Url of the current wed page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		WebElement registerLink = driver.findElement(By.xpath("//a[normalize-space()='REGISTER']"));
		registerLink.click();

		Thread.sleep(5000);
		// navigate()
		// we will open the specific of the web page
		String newUrl = "https://www.google.com";
		driver.navigate().to(newUrl);
		// navigate().back()
		// to go nack to the previous web page
		driver.navigate().back();

		driver.navigate().refresh();

		// navigate().forward()
		// to go to the next web page
		driver.navigate().forward();

		// quit(); //this will close al the window / all the browser tabe opened by the
		// driver
		driver.quit();

	}

}
