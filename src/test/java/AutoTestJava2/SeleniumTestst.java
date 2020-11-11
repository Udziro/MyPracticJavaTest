package AutoTestJava2;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumTestst {

    WebDriver driver;
    String inputText = "Hallo, My name is \"Ihor\"";

    By closeModalWindow = By.xpath(".//a[@class = \"at-cv-button at-cv-lightbox-yesno at-cm-no-button\"]");
    By inPutButton = By.xpath(".//div[@class=\"container\"]/div[@class = \"collapse navbar-collapse\"]//ul[1]//li[@class=\"dropdown\"][1]");
    By simpleInputForm = By.xpath(".//a[@href = \"./basic-first-form-demo.html\"]");
    By usingInputLine = By.xpath(".//input[@class = \"form-control\"]");
    By sendMessageButton = By.xpath(".//button[contains(text(),'Show Message')]");
    By checkingReturnMessage = By.xpath(".//span[@id='display']");


@BeforeTest
    public void InitPlugins(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



    }

    @Test
    public void testSelenium(){
        driver.findElement(closeModalWindow).click();
        driver.findElement(inPutButton).click();
        driver.findElement(simpleInputForm).click();
        driver.findElement(usingInputLine).sendKeys(inputText);
        driver.findElement(sendMessageButton).click();
        WebElement returnMassage = driver.findElement(checkingReturnMessage);
        String userMassage = returnMassage.getText();
       if(inputText.equals(userMassage)){
           System.out.println("Test passed");
       }else{
           System.out.println("Test is false");
       }
//        Assert.assertEquals(inputText,userMassage);


    }
    @AfterTest
    public void closeMethod(){
    driver.quit();
    }



}

