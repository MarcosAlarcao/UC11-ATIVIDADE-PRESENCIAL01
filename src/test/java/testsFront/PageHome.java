package testsFront;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHome {
    public WebDriver driver;
    
	@Before
	public void preparacao() {
		
	}
	@Test
	public void testFrontEnd() {
		System.setProperty("webdriver.chrome.driver", System.getenv("Driver"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.className("gLFyf")).sendKeys("senai");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("LC20lb")).click();
		driver.findElement(By.id("idControle_0")).click();
		driver.findElement(By.id("ctl00_Header1_MenuSuperior1_rptMenuLateral_ctl00_rptMenu_ctl05_lnkMenu")).click();
		driver.findElement(By.className("oqEstabuscando")).click();
		driver.findElement(By.className("oqEstabuscando")).sendKeys("t�cnicos");
		driver.findElement(By.className("oqEstabuscando")).sendKeys("keys.ENTER");
		//driver.findElement(By.className("btnBuscaJavaScript")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_cp_lv_ctrl_lnkTitu\"]/span")).click();
	try {
		Thread.sleep(2000);
	}   catch (InterruptedException e) {
		e.printStackTrace();
			
	}
	}
	
	
  @After
  public void fechar() {
	  driver.close();
}
}
