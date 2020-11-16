package AutoTestJava2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestTables {
    public void initializationDriver(String initializationDriver){
     initializationDriver = System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\IdeaProjects\\WebDriver\\chromedriver.exe");

    }
    WebDriver driver;
    String inputText = "Hello";


    @Test
    public void testTables()
    {

        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath(".//div[@class=\"sn-b-def sn-blue\"]")).click();
//        driver.findElement(By.xpath(".//table[@id=\"customers\"]"));


//        driver.quit();
    }
}
