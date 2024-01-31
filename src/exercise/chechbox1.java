package exercise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class chechbox1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       //WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
	         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	         driver.manage().window().maximize();
	       
	    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	         driver.findElement(By.id("checkBoxOption1")).click();
	         Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	     Assert.assertEquals(3,driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	       driver.close();
	}

}
