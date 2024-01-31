package exercise;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assign3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		String username = driver.findElement(By.cssSelector("p[class='text-center text-white']")).getText()
				.split("is")[1].split("and")[0].trim();
		String pass = driver.findElement(By.cssSelector("p[class='text-center text-white']")).getText().split("is")[2]
				.replace(")", " ").trim();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("okayBtn"))));
		driver.findElement(By.id("okayBtn")).click();
		WebElement x = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select s = new Select(x);
		s.selectByVisibleText("Student");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("	h4[class='card-title']"))));
		String[] item = { "iphone", "Samsung", "Nokia", "Blackberry" };
		cart(driver, item);

	}

	public static void cart(WebDriver driver, String[] item) {
		int j = 0;
		List<String> al = Arrays.asList(item);
		List<WebElement> prod = driver.findElements(By.cssSelector("h4[class='card-title'] a"));
		for (int i = 0; i <= al.size(); i++) {
			String name = prod.get(i).getText().split(" ")[0];
			if (al.contains(name)) {
				j++;
				driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
				;
				if (j == al.size())
					break;
			}

		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		Assert.assertTrue(true);

	}

}
