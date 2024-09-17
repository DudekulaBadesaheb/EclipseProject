package commands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
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

//			Thread.sleep(5000);

		// getCurrentUrl()
		// this will get the Url of the current wed page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// getPageSource()
		// this will get the html soure code of the web page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// grtTitle()
		// the will get the title of the web page

		String Title = driver.getTitle();
		System.out.println(Title);

		// getWindowHandle
		// this can be used to switch tho this window at alater time // this driver
		// instance

		String wind = driver.getWindowHandle();
		System.out.println(wind);
		// Return a set of window handles which can be used to iterate over all open
		// windows of thisWebDriver instance by passing them to
		// switchTo().Options.window()

		Set<String> window = driver.getWindowHandles();
		System.out.println(window);

		WebElement dateLabel = driver.findElement(By.xpath("//b[normalize-space()='Jul 6, 2017']"));
		// getText
		String dateText = dateLabel.getText();
		System.out.println(dateText);

		// close(): this will close the current window / current browser tab
		// driver.close();

		// quit(); //this will close al the window / all the browser tabe opened by the
		// driver
		// driver.quit();

	}

}
