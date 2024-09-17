package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		String chromeDriver = "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver);
//		System.out.println(System.getProperty("webdrive.chrome.driver"	));

		WebDriver driver;
		driver = new ChromeDriver();
		
		// to maximize chrome browser window
		driver.manage().window().maximize();
		
		// open https://www.google.come
		String url="https://www.google.com";
		driver.get(url);
		// it will close only the current window opened by the driver
		//driver.close();
		
		// it will close all the windows opened by driver
		//driver.quit();

	}

}
