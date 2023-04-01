package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void the_user_lauches_the_application() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://wwww.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void the_user_closes_the_browsers() {
		driver.quit();

}
}
