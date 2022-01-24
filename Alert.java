package assignmentweek4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    org.openqa.selenium.Alert alert= driver.switchTo().alert();
	    alert.sendKeys("Alerts");
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(1000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.close();


	}

}
