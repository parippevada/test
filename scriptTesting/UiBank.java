package scriptTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://uibank.uipath.com/register-account");
        
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("kenz");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Dep");
		WebElement sex = driver.findElement(By.xpath("//select[@id='sex']"));
		Select gen=new Select(sex);
		gen.selectByVisibleText("Male");
		
		WebElement status = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select gens=new Select(status);
		gens.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("26/06/2000");
		WebElement marry = driver.findElement(By.xpath("//select[@id='maritalStatus']"));
		Select genss=new Select(marry);
		genss.selectByVisibleText("Married");
		
		
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("know");
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kenzie6196");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kenz@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kenz");

}
}
