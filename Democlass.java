import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {
static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("http://localhost:8080/login?from=%2F");
		driver.findElement(By.id("j_username")).sendKeys("Shahina");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Kicksyam@123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
