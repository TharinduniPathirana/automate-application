package test01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("file:///C:/Users/Student/Desktop/application.html");
		driver.manage().window().maximize();

		driver.findElement(By.name("fn")).sendKeys("Hasadahara");

		driver.findElement(By.id("fn2")).sendKeys("Pathirana");

		driver.findElement(By.name("pass1")).sendKeys("1234");

		driver.findElement(By.name("pass2")).sendKeys("1234");

		driver.findElement(By.id("email")).sendKeys("hasadaharapathirana@gmail.com");

		driver.findElement(By.name("mobile")).sendKeys("0714567883");

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.findElement(By.id("description")).sendKeys("hello");

		WebElement radio1 = driver.findElement(By.id("female"));
		radio1.click();

		WebElement option1 = driver.findElement(By.className("automation1"));
		option1.click();

		WebElement option2 = driver.findElement(By.className("automation3"));
		option2.click();
		
		//validation part for hobbies
		
		if(option1.isSelected()) {
			System.out.println("hobby 1 is selected");
		}else if(option2.isSelected()) {
			System.out.println("hobby 2 is selected");
		}else {
			System.out.println("Empty");
		}
		
		//drop down menu Select Country
		
		driver.findElement(By.id("country")).sendKeys("SriLanka");

		}


}
