package webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TesteNavegarParaGoole() {
		driver.get("https://online.sp.senai.br//");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("disco de freio", Keys.ENTER);
		driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div/div/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div[1]/div/div/div[3]/div[1]/div/div[3]/a")).click();
		
	}

	@After
	public void FecharNavegador() {

		driver.close();
	}

}
