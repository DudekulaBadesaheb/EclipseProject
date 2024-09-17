package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		String chromeDriver = "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		System.out.println(System.getProperty("webdrive.chrome.driver"	));

		WebDriver driver;
		driver = new ChromeDriver();
//		driver.manage().window().maximize();

//		 String baseUrl = "https://www.youtube.com";
//		 driver.get(baseUrl);
		driver.quit();


	}

}
