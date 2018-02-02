import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Swati\\workspace\\selenium-java-3.0.0-beta2\\lib\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  
	      driver.get("http://facebook.com");
	      WebElement username = driver.findElement(By.id("email"));
	      username.sendKeys("abcd.xyz@gmail.com");
	      WebElement password = driver.findElement(By.id("pass"));
	      password.sendKeys("abcdefg");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("loginbutton")).click();
	 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	  Alert alert = driver.switchTo().alert();
	 	  driver.switchTo().alert().dismiss();
	 	  driver.findElement(By.id("userNavigationLabel")).click();
	      driver.findElement(By.linkText("Log Out")).click();
	}

}
