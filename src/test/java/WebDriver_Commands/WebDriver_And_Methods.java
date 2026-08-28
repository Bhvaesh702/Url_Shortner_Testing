package WebDriver_Commands;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_And_Methods {

	public static void main(String[] args) throws InterruptedException {
/* 1. get();
 * 2. close();
 * 3. quit();
 * 4. navigate();
 * 5. maximize();
 * 6. getTitle();
 * 7. getCurrentUrl();
 * 8. getSize();
 * 9. getPosition();
 * 10.getPosition.this();
 * 11.setSize();
 * 12. setPosition();
 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shorturl.at/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.navigate().to("https://tinyurl.com/");
		
		
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		Thread.sleep(2000);
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Dimension d= new Dimension(600,500);
		driver.manage().window().setSize(d);
		Dimension Size = driver.manage().window().getSize();
        System.out.println(Size);
		
		Point p= new Point(100,50);
		driver.manage().window().setPosition(p);
	    Point Position = driver.manage().window().getPosition();
	    System.out.println(Position);
		Thread.sleep(5000);
	    driver.close();
		
		
		
	}

}
