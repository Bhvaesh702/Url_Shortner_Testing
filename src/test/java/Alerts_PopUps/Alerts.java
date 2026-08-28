package Alerts_PopUps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		/* There are three types of Alerts
	 1) Normal Alerts- Ok Button visible onle
     2) Confirmation alert- Ok and Cancle button is available
     3) Prompt alert- Input Box, OK/Cancle Button available

		 * We Cannot Inspect Element on alert window.
		 */

		// NORMAL ALERT

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		driver.manage().window().maximize();
		/*	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Switching focus on alert and take action By accept(), dismiss() methods.
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
// We can also validate here text mismatch by comparing actual and expected text of alert
		alt.accept();
		 */


		//CONFIRMATION ALERT

		/*	driver.findElement(By.xpath("//ul[contains(@class,'nav nav-tabs nav-stacked')]/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.accept();
		Thread.sleep(3000);
		alt.dismiss();
		WebElement msg = driver.findElement(By.id("demo"));
		System.out.println(msg.getText());*/


		// PROMPT ALERT
		/*driver.findElement(By.xpath("//ul[contains(@class,'nav nav-tabs nav-stacked')]/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);

		alt.sendKeys("BHAVESH");
		Thread.sleep(3000);
		alt.accept();
		WebElement msg = driver.findElement(By.id("demo1"));
		System.out.println(msg.getText());*/












	}

}
