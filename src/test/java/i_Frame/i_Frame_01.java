package i_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_Frame_01 {

	
	
	/* Sometimes tagName will be frame or iframe.
	 * We can switch i frame with 3 methods
	 1) driver.switchTo().frame(name);
	 2) driver.switchTo().frame(id);
	 3) driver.switchTo().frame(WebElement);
	 4) driver.switchTo().frame(Index);
	
	*/
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Number of Iframe Present On WebPage: "+ iframes.size());
		driver.switchTo().frame(2);
       WebElement FirstName = driver.findElement(By.id("vfb-5"));
       FirstName.sendKeys("Bhavesh");
       System.out.println("Inside the IFrame Number 3");
       Thread.sleep(3000);
       driver.switchTo().parentFrame();
       Thread.sleep(3000);
       System.out.println("Outside the IFrame");
       driver.switchTo().frame(1);
       System.out.println("Inside Frame Number 2");
       Thread.sleep(3000);
       driver.findElement(By.name("alertbox")).click();
       Alert alt = driver.switchTo().alert();
       alt.accept();
       WebElement msg = driver.findElement(By.id("demotwo"));
       System.out.println(msg.getText());
       driver.close();
		
		
	}

}
