package com.sdetSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class w3Schools {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--allow driver--");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3Schools.com/");
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[3]/a[1]/i"));
		if(logo.isDisplayed())
			System.out.println("w3Schools logo is displayed");
		else
			System.out.println("w3Schools logo is not displayed");
		driver.close();
		}
	}
