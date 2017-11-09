// #Test2
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("######################");
		System.out.println("");
		System.out.println("Hello Sello Tshani, bula *#GECKO-driver 4 FireFox* // #Test2 :-)");
		System.out.println("");
		System.out.println("######################");
		
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\A232056\\Documents\\Softwares\\geckoDriver\\geckodriver.exe");
		
		//#FF
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A232056\\Documents\\Softwares\\geckoDriver\\geckodriver.exe");
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\A232056\\Documents\\Softwares\\geckoDriver\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://store.demoqa.com/";
		//System.out.println(driver.getTitle());
		String expectedTitle = "ONLINE STORE | Toolsqa Dummy Test site";
		String actualTitle = "";
		
		
		driver.get(baseUrl);
		
		//driver.wait(50);
		actualTitle = driver.getTitle();
		System.out.println("");
		System.out.println(actualTitle + " - Actual Response");
		System.out.println("");
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed - Expected Browser Title: ONLINE STORE | Toolsqa Dummy Test site");
		}else {
			System.out.println("Test Failed - Browser Failed to open: Unknown Host");
		}
		
		//WebElement struserName = driver.findElement(By.name("userName"));
		//WebElement strpassWord = driver.findElement(By.name("password"));
		
		
		//driver.close();
		
	}

}
