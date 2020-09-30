package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("dany");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("dany123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();		
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		Thread.sleep(3000);
		WebElement DD = driver.findElement(By.name("fromPort"));
		Select selc = new Select(DD);
		List<WebElement> values = selc.getOptions();
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			String value = values.get(i).getText();
			System.out.println(value);
		}
		selc.selectByVisibleText("London");
		selc.selectByIndex(1);
		
	}

}
