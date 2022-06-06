package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[2]/a/span[2]")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/span/div/div/div/div/div[2]"))
				.sendkeys("PNQ");

		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[10]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();

	}

}
