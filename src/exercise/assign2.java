package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       //WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
	         driver.get("https://rahulshettyacademy.com/angularpractice/");
	         driver.manage().window().maximize();
	         driver.findElement(By.name("name")).sendKeys("Rahul Shetty");
	         driver.findElement(By.name("email")).sendKeys("contact@rahulshettyacademy.com");
	         driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
	         driver.findElement(By.id("exampleCheck1")).click();
	         WebElement x= driver.findElement(By.id("exampleFormControlSelect1"));
	         Select s=new Select(x);
	         s.selectByVisibleText("Male");
	         driver.findElement(By.id("inlineRadio1")).click();
	         driver.findElement(By.name("bday")).sendKeys("12-12-2002");
	         driver.findElement(By.cssSelector("input[value='Submit']")).click();;
	       System.out.println(driver.findElement(By.cssSelector("div[class*='success alert']")).getText());
	         
	}
	
}
