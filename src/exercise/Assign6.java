package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assign6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String var = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		driver.findElement(By.cssSelector("label[for='benz']")).click();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(var);
		driver.findElement(By.id("name")).sendKeys(var);
		driver.findElement(By.id("alertbtn")).click();
		String a = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		Assert.assertEquals(var, a);
		System.out.print("hi");
	}

}
