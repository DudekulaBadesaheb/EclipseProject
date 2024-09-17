package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=RgFREgOgSlE");
		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selinum-files\\chromedriver\\128\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
////		driver.get("https://www.youtube.com/watch?v=RgFREgOgSlE");
//		driver.get("https://github.com/DudekulaBadesaheb/interview");
      
	}

}
