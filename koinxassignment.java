package koinesfinal;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class koinxassignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Open Browser		
		driver.get("https://x8ki-letl-twmt.n7.xano.io/api:gHPd8le5");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//POST Method Code
		
		//Click on Post Method Code
        driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[5]/div/div[1]/button/span[1]")).click();
		
		Thread.sleep(2000);
		
		//Click On Try It Out Button Code
		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[5]/div/div[2]/div/div[2]/div[1]/div[2]/button")).click();
	
		
		//driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[5]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div/textarea")).clear();
		
		//Put Values in Textbox
		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[5]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div/textarea")).sendKeys("{\r\n"
				+ "  \"coin1\": \"INR\",\r\n"+ "  \"coin2\": \"USDT\",\r\n"+ "  \"coin1Amount\": 400,\r\n"+ "  \"coin2Amount\": 11\r\n"	+ "}");
		
		//Click On Execute Button Code
	    driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[5]/div/div[2]/div/div[3]/button")).click();
		
	    
	    
	    //GET Method Code
		
		//Click On GET Method Code
	   driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[2]/div/div/button/div")).click();
	   
		//Click On Try It Out Button Code
	   driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[2]/div/div[2]/div/div[2]/div[1]/div[2]/button")).click();
	   
		//Click ID Put Code
	   driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[2]/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/input")).sendKeys("7");
	   	   
	   //Click On Execute Button Code
	   driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[4]/section/div/span[1]/div/div/div/span[2]/div/div[2]/div/div[3]/button")).click();
	}
}