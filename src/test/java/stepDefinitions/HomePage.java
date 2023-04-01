package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class HomePage {
	
	@Test
	public void start() {
		
	}
	public static WebDriver driver;
	
	@io.cucumber.java.en.Given("^The user launches the application$")
	public void the_user_lauches_the_application() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://wwww.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@io.cucumber.java.en.Then("^The user closes the browser$")
	public void the_user_closes_the_browsers() {
		driver.quit();
		
	}
	@io.cucumber.java.en.When("^The user seaches an item \"([^\"]*)\"$")
	public void the_user_searches_an_item(String item) {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		search.sendKeys(Keys.ENTER);
		
	}
	

}
