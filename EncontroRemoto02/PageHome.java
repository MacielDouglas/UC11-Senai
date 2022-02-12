package testGamemania;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHome {
	private WebDriver driver;
	
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/");
		
		
	}
	

	@Test
	public void TestarLogin() throws InterruptedException {
			
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(3300, TimeUnit.SECONDS);
		driver.findElement(By.id("mat-tab-label-0-1")).click();
		
		//Teste 01 Cadastro de Novo Usuário;
		
		driver.findElement(By.id("nome")).sendKeys("Carlos Silva");
		driver.findElement(By.id("email")).sendKeys("carlos@mail.com");
		driver.findElement(By.id("senha")).sendKeys("senha1234");
		driver.findElement(By.id("confSenha")).sendKeys("senha1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-header/header/div[2]/nav/div/div[1]/div[2]/div/mat-card/app-novo-cliente/mat-tab-group/div/mat-tab-body[2]/div/mat-card-content/form/button/span[1]")).click();
		
		//Teste 02, realizando o Login C/ Novo Usuário;
		Thread.sleep(1000);
		driver.findElement(By.id("mat-tab-label-0-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("carlos@mail.com");
		driver.findElement(By.id("senha")).sendKeys("senha1234");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-header/header/div[2]/nav/div/div[1]/div[1]/span")).click();
		Thread.sleep(1000);
	}
	
	@After
	public void FecharNavegador() {

		driver.close();
	}

}
