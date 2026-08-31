package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	protected Properties p;
//@Parameters({"browser"})
	@BeforeClass


	public void Setup() throws IOException
	{
		logger= LogManager.getLogger(this.getClass()); 
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		driver= new ChromeDriver();
		p.load(file);
		driver.get(p.getProperty("AppUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterClass
	public void TearDown()
	{
		driver.quit();

	}
	// Screenshot Capturing
	public String CaptureScreen(String tName)
	{
		String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot takeScreenShot= (TakesScreenshot)driver;
		File file= takeScreenShot.getScreenshotAs(OutputType.FILE);
	String DestPath = System.getProperty("user.dir")+"\\screenshots\\"+tName+"_"+timeStamp+".jpg";
		File Dest= new File(DestPath);
		file.renameTo(Dest);
		return DestPath;
	
	}
}
