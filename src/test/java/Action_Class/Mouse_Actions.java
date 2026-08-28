package Action_Class;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Actions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mfcentral.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement LogInBtn = driver.findElement(By.xpath("//div[@class='nav-btns']/a[1]"));
		act.moveToElement(LogInBtn).click().perform();
		WebElement UserId = driver.findElement(By.name("userId"));
		act.moveToElement(UserId).click().sendKeys("CTWPM7251E").build().perform();
		WebElement Password = driver.findElement(By.name("password"));
		act.moveToElement(Password).click().sendKeys("Token@2026").build().perform();
		/*
		 * 
		 * WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement DoubleClick = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleBtn")));

		driver.manage().window().maximize();
		//WebElement Double_Click=driver.findElement(By.id("doubleBtn"));
		Actions act= new Actions(driver);
		act.doubleClick(DoubleClick).perform();
		//	act.doubleClick(driver.findElement(By.id("doubleBtn"))).perform();
		//act.moveToElement(Double_Click).doubleClick().build().perform();
		WebElement DoubleClickStatus=driver.findElement(By.id("doubleStatus"));
		System.out.println(DoubleClickStatus.getText());
		
		WebElement RightClick=wait.until(ExpectedConditions.elementToBeClickable(By.id("rightBtn")));
		act.contextClick(RightClick).perform();
		WebElement RightClickStatus=driver.findElement(By.id("rightStatus"));
		System.out.println(RightClickStatus.getText());
		
		
		//WebElement Src=wait.until(ExpectedConditions.elementToBeClickable(By.id("dragItem")));
		//WebElement Dest=wait.until(ExpectedConditions.elementToBeClickable(By.id("dropZone")));
		
		 //act.dragAndDrop(Src, Dest).perform();
		
		WebElement TooltipHover=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tooltipTarget")));
		//Before Hovering
		WebElement ToolTipStatus=driver.findElement(By.id("tooltipStatus"));
		String BeforeHover = ToolTipStatus.getText();
		System.out.println("Before Hovering Status:" + BeforeHover);
		act.moveToElement(TooltipHover).perform();
    String  AfterHover= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tooltipStatus"))).getText();
    System.out.println("Before Hovering Status:" + AfterHover);
   @NonNull
WebElement ToolTipText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tooltipTarget")));
   @Nullable
String ActualToolTipText = ToolTipText.getAttribute("title");
   System.out.println(ActualToolTipText);

		 */
		
	}

}
