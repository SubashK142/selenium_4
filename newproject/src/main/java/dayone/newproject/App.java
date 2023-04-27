package dayone.newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
//        System.out.println( "Hello World!" );
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver= new EdgeDriver();
//       
//        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("subash");
//        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("k");  
//        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727721euai055@skcet.ac.in");  
//        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("subash@123");  
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
//        
        System.out.println( "Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.navigate().to("https://j2store.net/free/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//+[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        
        
        
    }
}
