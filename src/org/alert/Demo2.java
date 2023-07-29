package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver " , "C:\\Users\\vishn\\eclipse-workspace\\Day6\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://demo.automationtesting.in/Alerts.html");
	      driver.manage().window().maximize();
	       driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	      driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	      Alert a = driver.switchTo().alert();
	      Thread.sleep(1000);
	   a.sendKeys("Automation");  
	 
      System.out.println(a.getText());
      a.accept();
	}

}
