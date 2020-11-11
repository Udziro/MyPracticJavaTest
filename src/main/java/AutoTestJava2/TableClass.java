package AutoTestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableClass {
 private WebElement tableElements;
 private WebDriver driver;


 public TableClass(WebElement tableElements, WebDriver driver){
    this.tableElements = tableElements;
    this.driver = driver;
}

public  List<WebElement> getRows(){
     List<WebElement> rows = tableElements.findElements(By.xpath(".//tr"));
     rows.remove(0);
     return rows;
}
public List<WebElement> getHeadings(){
     WebElement headingRow = tableElements.findElement(By.xpath(".//tr[1]"));
     List<WebElement> headingsColumns = headingRow.findElements(By.xpath(".//th"));
     return headingsColumns;
}
//text
    //contans(text())


}
