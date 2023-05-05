package CodeMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing')]")).getText());
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//a")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a) [2]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus ')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(@class,'a-size-large a-color-price ')")).getText());
		System.out.println(driver.getTitle());
		

	}

}
