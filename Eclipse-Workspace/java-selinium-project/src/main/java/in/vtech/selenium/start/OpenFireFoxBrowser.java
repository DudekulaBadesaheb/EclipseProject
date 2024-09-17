package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) {
		String firefoxDriver = "D:\\selinum-files\\geckodriver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxDriver);
//		System.out.println(System.getProperty("webdrive.chrome.driver"	));

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=RgFREgOgSlE");
//		driver.quit();

	}

}
