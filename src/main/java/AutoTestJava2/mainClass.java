package AutoTestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class mainClass {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\IdeaProjects\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.navigate().to("https://google.com");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//        driver.navigate().back();
//        driver.navigate().refresh();
//        driver.navigate().refresh();

       WebElement getInput = driver.findElement(By.xpath("//*[@id='searchInput']"));
                  getInput.sendKeys("Nflfv");
                  System.out.println( getInput.getAttribute("value"));
        driver.findElement(By.xpath("//*[@id=\"searchButton\"]\n")).click();
        driver.findElement(By.linkText("'Search results'"));


        driver.quit();






    }


}
