package AutoTestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CheckBox {

       static WebDriver driver;
       public static void WebDriverLink() {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\IdeaProjects\\WebDriver\\chromedriver.exe");
       }




     public static void main(String[] args) {


       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();

       driver.get("https://rozetka.com.ua/promo/bigfashionsale");
       driver.findElement(By.xpath("/html/body/app-root/div/div[1]/rz-promo/main/rz-catalog/div/div/aside/rz-filter-stack/div/div/div/rz-filter-tree/ul/li[2]/a/span[1]")).click();

        System.out.println(driver.findElement(By.xpath("/html/body/app-root/div/div[1]/rz-promo/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[1]/a/label")));
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
        if (!driver.findElement(By.xpath("/html/body/app-root/div/div[1]/rz-promo/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[1]/a/label")).isSelected()){
            driver.findElement(By.xpath("/html/body/app-root/div/div[1]/rz-promo/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[1]/a/label")).click();
        }

        System.out.println(driver.findElement(By.id("H&M")).isSelected());





//        System.out.println(produsers.findElement(By.xpath("/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a/label")).isSelected());

//       produsers.findElement(By.xpath("/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a/label")).click();
//        System.out.println(produsers.findElement(By.xpath("/rz-scrollbar/div/div[1]/div/div/rz-filter-checkbox/ul[1]/li[2]/a/label")).isSelected());
    }
}
