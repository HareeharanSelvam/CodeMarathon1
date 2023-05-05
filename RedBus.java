package CodeMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		ChromeDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.redbus.in/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver1.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver1.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver1.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver1.findElement(By.xpath("//li[@class='selected']")).click();
		driver1.findElement(By.xpath("//td[@class='we day']")).click();
		driver1.findElement(By.xpath("//button[@id='search_btn']")).click();
		WebElement bus=driver1.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println(bus.getText());
        driver1.findElement(By.xpath("//label[@title='SLEEPER']")).click();
        WebElement bus1=driver1.findElement(By.xpath("//span[@class='f-bold busFound']"));
        System.out.println(bus1.getText());
        System.out.println(driver1.getTitle());
        
        
        
     
		
		

	}

}
