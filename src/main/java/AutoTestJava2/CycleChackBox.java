package AutoTestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class CycleChackBox {
    WebDriver driver;
    String url = "https://rozetka.com.ua/";


public void PlaginsForTest(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\IdeaProjects\\WebDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);

}




    @Test
    public void cycleBox(){
    PlaginsForTest();
    List<WebElement> listOfElements = driver.findElements(By.xpath(".//div[@class='menu-wrapper menu-wrapper_state_static']//ul//li"));
    if (listOfElements.size() == 18 ) System.out.println("Test is Passed");
    else{
            System.out.println("Critical error");
        }

    listOfElements.get(3).click();
    String currentUrl = driver.getCurrentUrl();
    String urlBT = "https://bt.rozetka.com.ua/";

    if (currentUrl.equals(urlBT)){
        System.out.println("Test is passed");
    }else{
        System.out.println("Critical error");
    }
        driver.quit();
//    for (WebElement element : listOfElements){
//        element.get[];
//    }


//    driver.quit();
}


//    @Test
//    public void NextTest(){
//        PlaginsForTest();
//
//        driver.quit();
//
//    }


}
