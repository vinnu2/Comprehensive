package com.sdetSelenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTripWebElements {
	private WebDriver driver;
	public static void ClickElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	public static void SendKeys(WebDriver driver, By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(text);
	}
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--allow driver--");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
//fights
		ClickElement(driver, By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]"));
//oneWay
		ClickElement(driver, By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]"));
//From
		ClickElement(driver, By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span"));
//From text
		SendKeys(driver, By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"), "Mumbai,India");
		ClickElement(driver, By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
//To
		ClickElement(driver, By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span"));
//To text
		SendKeys(driver, By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"), "NewDelhi,India");
		ClickElement(driver, By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
		String URL = driver.getCurrentUrl();
		if(URL == "https://www.makemytrip.com/flights/")
			System.out.println("Successfully we are search for flights");
		else
			System.out.println("Failed to search for flights");
		driver.close();
	}
}
