package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		
		WebElement login=driver.findElement(By.id("ap_email_login"));
		login.sendKeys("9876543210");
		
		Actions act=new Actions(driver);
		act.doubleClick(login).perform();
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_X);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_X);
		
	}
}
