/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jagruti Patel
 */
public class CostcoSearch {
     private static  WebDriver driver;
  private static String baseUrl;
    public CostcoSearch() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }
     

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
   
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    @Test
  public void testCostcoSearch() throws Exception {
    driver.get("https://www.bing.com/search?q=costco.com&form=ANSPH1&refig=db58aba71a5344a1ad0e9a46dc630e49&pc=U531");
    driver.findElement(By.linkText("Welcome to Costco Wholesale")).click();
    driver.get("https://www.bing.com/ck/a?!&&p=db7576b51b69d35fJmltdHM9MTY1OTU1NjA1OSZpZ3VpZD04ZDhjMjQ4NS1kODE3LTQ1NGEtOWVkNi1kMWRmZTA1MDkxN2MmaW5zaWQ9NTE5Ng&ptn=3&hsh=3&fclid=2163eb88-1365-11ed-aec7-3fa76c9e6583&u=a1aHR0cHM6Ly93d3cuY29zdGNvLmNvbS8&ntb=1");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("search-field")).click();
    driver.findElement(By.id("search-field")).click();
    driver.findElement(By.id("search-field")).clear();
    driver.findElement(By.id("search-field")).sendKeys("laptops");
    driver.findElement(By.id("formcatsearch")).submit();
  }
}
