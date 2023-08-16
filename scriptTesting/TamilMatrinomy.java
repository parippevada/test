package scriptTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrinomy {
	
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.tamilmatrimony.in/");
	WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
	Select set=new Select(profile);
	set.selectByVisibleText("Myself");
	driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("ravi");
	driver.findElement(By.xpath("//input[@id='gendermale']")).click();
	WebElement day = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
	Select days= new Select(day);
	days.selectByValue("10");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
	Select months= new Select(month);
	months.selectByVisibleText("June");
	WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
	Select years= new Select(year);
	years.selectByValue("2000");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement relig = driver.findElement(By.xpath("//select[@id='RELIGION']"));
	Select relig = new Select(relig);
	relig.selectByVisibleText("hindu");
	
	WebElement mothertq = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select mother=new Select(mothertq);
	mother.selectByVisibleText("Arunachali");
	
	
	WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
	Select coun=new Select(country);
	coun.selectByVisibleText("India");
	
	WebElement code = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
	Select coutrycode=new Select(code);
	coutrycode.selectByValue("+91");
	
	

	driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("kenzie@gmail.com");
	
	driver.close();
}
}
