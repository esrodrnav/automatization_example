package com.fototeca.aut.busquedaFotograma;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BusquedaFotogramaTestTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/tools/chromedriver/chromedriver");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless", "--window-size=1920,1200");
	  driver = new ChromeDriver(options);
	  js = (JavascriptExecutor) driver;
	  vars = new HashMap<String, Object>();
	  }
  

  @AfterMethod
  public void tearDown() {
	    driver.quit();
	  }

  @Test
  public void busquedaFotogramaTest() {
    //throw new RuntimeException("Test not implemented");
 // Test name: busquedaFotograma
    // Step # | name | target | value
    // 1 | open | /fototeca/visor | 
    driver.get("http://fototecapru.ieca.junta-andalucia.es/fototeca/visor");
    // 2 | setWindowSize | 1309x630 | 
    driver.manage().window().setSize(new Dimension(1309, 630));
    // 3 | click | css=.searchPosition svg | 
    driver.findElement(By.cssSelector(".searchPosition svg")).click();
    // 4 | click | id=queryText | 
    driver.findElement(By.id("queryText")).click();
    // 5 | type | id=queryText | Sevilla
    driver.findElement(By.id("queryText")).sendKeys("Sevilla");
    // 6 | click | css=.underListButton | 
    driver.findElement(By.cssSelector(".underListButton")).click();
  }
}
