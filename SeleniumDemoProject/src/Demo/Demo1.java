package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).click();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).clear();
		String beforeLogin = driver.getTitle();
		String urlOfCurrentPage = driver.getCurrentUrl();
		String id = driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("id");
		System.out.println(id);
		driver.findElement(By.xpath("//*[@id='"+id+"']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String afterLogin = driver.getTitle();
		if(beforeLogin.equals(afterLogin)) {}
		//driver.close();
	}

}
